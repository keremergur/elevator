package elevator;

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

    Direction directionFromTo(Floor current, Floor target) {
        if(current == target) return Direction.HALT;
        int diff = this.floors.indexOf(target) - this.floors.indexOf(current);
        if(diff > 0) {
            return Direction.UP;
        }
        return Direction.DOWN;
    }

}
