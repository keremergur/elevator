package src;

import java.util.*;

public class Elevator extends Thread {

    int elevatorId;

    Building building;

    Floor currentFloor;
    Floor targetFloor;

    Direction going = Direction.HALT;

    Queue<Floor> goingTo = new LinkedList<>();

    public Elevator(Building building, int elevatorId){
        this.building = building;
        this.elevatorId = elevatorId;
    }

    void move(Direction d) {
        if(d == Direction.HALT) return;
        Floor nextFloor = building.adjacentFloor(currentFloor, d);
        if(nextFloor.waiting(d)) {
            this.slowDownToHalt();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        currentFloor = nextFloor;
    }

    void slowDownToHalt() {}

    @Override
    public void run(){

        while(true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(currentFloor == targetFloor) continue;

            Direction heading = building.directionFromTo(currentFloor, targetFloor);
            this.move(heading);

            if(goingTo.contains(currentFloor)) {
                goingTo.remove(currentFloor);
            }
            if(currentFloor.waiting(heading)) {
                currentFloor.unWait(heading);
            }
        
        }

    }

}

enum Direction {
    UP(1),
    HALT(0),
    DOWN(-1);

    public final int value;

    private Direction(int value){
        this.value = value;
    }
}
