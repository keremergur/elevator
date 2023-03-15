
import java.util.*;

public class Initializer {

    static List<Floor> initializeFloors(int numFloors, int lowestNo){
        List<Floor> floors = new ArrayList<>();
        int roof = lowestNo+numFloors;
        for(int i = lowestNo; i < roof; i++){
            floors.add(new Floor(i));
        }
        return floors;
    }

    static List<Elevator> initializeElevators(int numElevators){
        List<Elevator> elevators = new ArrayList<>();
        for(int i = 0; i < numElevators; i++){
            elevators.add(new Elevator(i));
        }
        return elevators;
    }

    static Map<Floor, Boolean> initializeFloorMap(List<Floor> floors){
        Map<Floor, Boolean> map = new HashMap<>();
        for(Floor f : floors){
            map.put(f, false);
        }
        return map;
    }
    
}
