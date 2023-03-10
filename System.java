
import java.util.*;

public class System extends Thread {

    static List<Floor> floors = Initializer.initializeFloors(10);
    static List<Elevator> elevators = Initializer.initializeElevators(2);

    static Queue<Floor> callQueue = new LinkedList<>();

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

}