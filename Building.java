
import java.util.*;

public class Building {

    int numberOfFloors; // Including ground floor
    int numberOfElevators;

    public Building(int numberOfFloors, int numberOfElevators){
        this.numberOfFloors = numberOfFloors;
        this.numberOfElevators = numberOfElevators;
    }

    List<Floor> floors = Initializer.initializeFloors(numberOfFloors);
    List<Elevator> elevators = Initializer.initializeElevators(numberOfElevators);

    System system = new System();
    
}
