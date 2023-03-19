package src;

import java.util.*;

public class Elevator extends Thread {

    int elevatorId;

    Building building;

    Floor currentFloor;
    Floor targetFloor;

    boolean goingUp = false;
    boolean goingDown = false;

    Set<Floor> goingTo = new HashSet<>();

    public Elevator(Building building, int elevatorId){
        this.building = building;
        this.elevatorId = elevatorId;
    }

    void move(Direction d) throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch(d) {
            case UP:
                this.currentFloor = this.building
                    .floorAbove(this.currentFloor);
                break;
            case DOWN:
                this.currentFloor = this.building
                    .floorBelow(this.currentFloor);
                break;
            default:
                throw new Exception();
        }
    }

    @Override
    public void run(){

        while(true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

enum Direction {
    UP(1),
    DOWN(-1);

    public final int value;

    private Direction(int value){
        this.value = value;
    }
}
