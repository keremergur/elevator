
import java.util.*;

public class ElevatorSystem extends Thread {

    Queue<Floor> floorQueue = new LinkedList<>();

    public ElevatorSystem(){

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