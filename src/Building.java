package src;

import java.util.*;


public class Building {

    int lowestFloorNo;
    int numberOfFloors; // Including ground floor
    int numberOfElevators;

    List<Floor> floors;
    List<Elevator> elevators;
    EVSystem sys;

    public Building(int numberOfFloors, int numberOfElevators) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfElevators = numberOfElevators;
        this.floors = Initializer
            .initializeFloors(numberOfFloors, lowestFloorNo);
        this.elevators = Initializer
            .initializeElevators(this, numberOfElevators);
        this.sys = new EVSystem(this);
    }

    public void runEVSystem() {
        this.sys.start();
    }
    
    Floor getFloor(int floorNo) {
        return this.floors.get(floorNo - this.lowestFloorNo);
    }

    Floor adjacentFloor(Floor f, Direction d) {
        int i = this.floors.indexOf(f);
        if((i <= 0 && d == Direction.DOWN)
        || (i >= this.numberOfFloors - 1 && d == Direction.UP))
            return null;
        return this.floors.get(i + d.value);
    }

    Elevator nearestFreeElevator(Floor f) {
        int targetFloorNo = f.floorNumber;
        return this.elevators.stream()
            .filter(x -> x.going == Direction.HALT)
            .min((a,b) -> 
                    (Math.abs(targetFloorNo - a.currentFloor.floorNumber))
                    -
                    (Math.abs(targetFloorNo - b.currentFloor.floorNumber))
                ).get();
    }

}
