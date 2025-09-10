public class Elevator {
    public final int id;
    public int currentFloor = 0;
    public boolean moving = false;

    public Elevator(int id){ 
        this.id = id; 
    }

    public void moveTo(int floor){
        moving = true;
        currentFloor = floor;
        moving = false;
    }

    @Override 
    public String toString(){ 
        return "Elevator " + id + " @ " + currentFloor; 
    }
}
