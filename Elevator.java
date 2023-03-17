
import java.util.*;

public class Elevator extends Thread {

    int elevatorId;

    Building building;

    Floor currentFloor;
    Floor targetFloor;

    boolean goingUp = false;
    boolean goingDown = false;

    Map<Floor, Boolean> goingTo = Initializer.initializeFloorMap(this.building.floors);

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
        int nextFloor = this.currentFloor.floorNumber + d.value;
        this.currentFloor = this.building.floors.get(nextFloor);
        if(this.currentFloor.floorNumber != nextFloor){
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
