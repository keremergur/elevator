
import java.util.*;

public class EVSystem extends Thread {

    Queue<Floor> floorQueue = new LinkedList<>();

    public EVSystem(){

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