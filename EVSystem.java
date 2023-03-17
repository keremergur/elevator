
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

}