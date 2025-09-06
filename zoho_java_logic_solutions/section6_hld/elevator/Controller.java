
package elevator;
import java.util.*;
public class Controller {
    private final List<Elevator> elevators = new ArrayList<>();
    public Controller(int n){ for(int i=1;i<=n;i++) elevators.add(new Elevator(i)); }
    public Elevator assign(int floor){
        Elevator best = elevators.get(0); int bestDist=Math.abs(best.currentFloor-floor);
        for(Elevator e: elevators){ int d=Math.abs(e.currentFloor-floor); if(d<bestDist){ best=e; bestDist=d; } }
        best.moveTo(floor); return best;
    }
    public String toString(){ return elevators.toString(); }
}
