
import java.util.*;

public class System extends Thread {

    static Queue<Floor> floorQueue = new LinkedList<>();

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