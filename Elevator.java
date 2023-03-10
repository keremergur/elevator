
import java.util.*;

public class Elevator {

    int elevatorId;
    int currentFloor;

    Map<Floor, Boolean> goingTo = Initializer.initializeFloorMap();

    public Elevator(){
        this(0, 0);
    }

    public Elevator(int elevatorId, int currentFloor){
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
    }

}
