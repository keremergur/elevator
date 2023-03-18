
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

    static List<Elevator> initializeElevators(Building building, int numElevators){
        List<Elevator> elevators = new ArrayList<>();
        for(int i = 0; i < numElevators; i++){
            elevators.add(new Elevator(building, i));
        }
        return elevators;
    }
    
}
