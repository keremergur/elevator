package app.src.main.java.elevator;

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

    boolean waiting(Direction d) {
        switch(d) {
            case UP:
                if(waitingUp) return true;
                break;
            case DOWN:
                if(waitingDown) return true;
                break;
            default:
                throw new IllegalArgumentException("Illegal direction!");
        }
        return false;
    }

    void unWait(Direction d) {
        switch(d) {
            case UP:
                waitingUp = false;
                break;
            case DOWN:
                waitingDown = false;
                break;
            default:
                throw new IllegalArgumentException("Illegal direction!");
        }
    }

}