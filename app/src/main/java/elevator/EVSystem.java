package elevator;

import java.util.*;

public class EVSystem extends Thread {

    Building building;
    Queue<Floor> floorQueue = new LinkedList<>();

    public EVSystem(Building building){
        this.building = building;
    }

    @Override
    public void run(){

        while(true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    Elevator nearestFreeElevator(Floor f) {
        int targetFloorNo = f.floorNumber;
        return this.building.elevators.stream()
            .filter(x -> x.going == Direction.HALT)
            .min((a,b) -> 
                    (Math.abs(targetFloorNo - a.currentFloor.floorNumber))
                    -
                    (Math.abs(targetFloorNo - b.currentFloor.floorNumber))
                ).get();
    }

}