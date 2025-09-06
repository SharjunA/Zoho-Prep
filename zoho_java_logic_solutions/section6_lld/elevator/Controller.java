
import java.util.*;
public class Controller {
    private final List<Elevator> elevators = new ArrayList<>();
    public Controller(int count){ for (int i=1;i<=count;i++) elevators.add(new Elevator(i)); }
    public Elevator assign(int requestFloor){
        Elevator best = elevators.get(0);
        int bestDist = Math.abs(best.currentFloor - requestFloor);
        for (Elevator e : elevators){
            int d = Math.abs(e.currentFloor - requestFloor);
            if (d < bestDist){ best = e; bestDist = d; }
        }
        best.moveTo(requestFloor);
        return best;
    }
    @Override public String toString(){ return elevators.toString(); }
}
