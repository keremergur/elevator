import app.src.main.java.elevator.Building;

public class Simulator {

    public static void main(String[] args){

        if(args.length != 2){
            throw new IllegalArgumentException();
        }

        int numFloors = Integer.parseInt(args[0]);
        int numEvs = Integer.parseInt(args[1]);

        Building building = new Building(numFloors, numEvs);

        building.runEVSystem();
        
    }
    
}
