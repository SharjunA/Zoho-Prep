
package elevator;
public class Elevator {
    public final int id; public int currentFloor=0; public boolean moving=false;
    public Elevator(int id){ this.id=id; }
    public void moveTo(int f){ moving=true; currentFloor=f; moving=false; }
    public String toString(){ return "Elevator "+id+" @ "+currentFloor; }
}
