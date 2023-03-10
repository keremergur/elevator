package elevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class System {

    static List<Floor> floors = Initializer.initializeFloors(10);
    static List<Elevator> elevators = Initializer.initializeElevators(2);

}

class Floor {

    int floorNumber;
    boolean waitingUp = false;
    boolean waitingDown = false;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
    }

    void buttonUp(){
        this.waitingUp = true;
    }

    void buttonDown(){
        this.waitingDown = true;
    }

}

class Elevator {

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

class Initializer {

    static ArrayList<Floor> initializeFloors(int numFloors){
        ArrayList<Floor> floors = new ArrayList<>();
        for(int i = 0; i < numFloors; i++){
            floors.add(new Floor(i));
        }
        return floors;
    }

    static ArrayList<Elevator> initializeElevators(int numElevators){
        ArrayList<Elevator> elevators = new ArrayList<>();
        for(int i = 0; i < numElevators; i++){
            elevators.add(new Elevator(i+1, 0));
        }
        return elevators;
    }

    static Map<Floor, Boolean> initializeFloorMap(){
        Map<Floor, Boolean> map = new HashMap<>();
        for(Floor f : System.floors){
            map.put(f, false);
        }
        return map;
    }

}