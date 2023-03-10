
import java.util.*;

public class Initializer {

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
