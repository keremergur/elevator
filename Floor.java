
public class Floor {

    int floorNumber;
    boolean waitingUp = false;
    boolean waitingDown = false;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
    }

    void buttonUp(){
        this.waitingUp = true;
    }

    void buttonDown(){
        this.waitingDown = true;
    }

}