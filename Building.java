
import java.util.*;

public class Building {

    int lowestFloorNo;
    int numberOfFloors; // Including ground floor
    int numberOfElevators;

    List<Floor> floors = Initializer.initializeFloors(numberOfFloors, lowestFloorNo);
    List<Elevator> elevators = Initializer.initializeElevators(numberOfElevators);

    public Building(int numberOfFloors, int numberOfElevators){
        this.numberOfFloors = numberOfFloors;
        this.numberOfElevators = numberOfElevators;
    }

}
