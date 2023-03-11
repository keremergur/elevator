
import java.util.*;

public class Elevator extends Thread {

    int elevatorId;

    Floor currentFloor;
    Floor targetFloor;

    boolean goingUp = false;
    boolean goingDown = false;

    Map<Floor, Boolean> goingTo = Initializer.initializeFloorMap();

    public Elevator(int elevatorId){
        this(elevatorId, null);
    }

    public Elevator(int elevatorId, Floor currentFloor){
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
        this.targetFloor = currentFloor;
    }

    void moveUp() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int nextFloor = this.currentFloor.floorNumber + 1;
        this.currentFloor = System.floors.get(nextFloor);
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
