package src;

import java.util.*;


public class Building {

    int lowestFloorNo;
    int numberOfFloors; // Including ground floor
    int numberOfElevators;

    List<Floor> floors = Initializer
        .initializeFloors(numberOfFloors, lowestFloorNo);
    List<Elevator> elevators = Initializer
        .initializeElevators(this, numberOfElevators);
    EVSystem sys = new EVSystem(this);

    public Building(int numberOfFloors, int numberOfElevators) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfElevators = numberOfElevators;
    }

    public void runEVSystem() {
        this.sys.start();
    }
    
    Floor getFloor(int floorNo) {
        return this.floors.get(floorNo - this.lowestFloorNo);
    }

    Floor floorAbove(Floor f) {
        int i = this.floors.indexOf(f);
        if(i >= this.numberOfFloors - 1) return null;
        return this.floors.get(i + 1);
    }
    
    Floor floorBelow(Floor f) {
        int i = this.floors.indexOf(f);
        if(i <= 0) return null;
        return this.floors.get(i - 1);
    }

    Elevator nearestFreeElevator(Floor f) {
        int targetFloorNo = f.floorNumber;
        return this.elevators.stream()
            // filter ev in use
            .min((a,b) -> 
                    (Math.abs(targetFloorNo - a.currentFloor.floorNumber))
                    -
                    (Math.abs(targetFloorNo - b.currentFloor.floorNumber))
                ).get();
    }

}