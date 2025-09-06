
package railway;
import java.util.*;
public class Train {
    public final String number;
    public final String name;
    private final int totalSeats;
    private final boolean[] booked;
    public Train(String number, String name, int totalSeats) {
        this.number = number; this.name = name; this.totalSeats = totalSeats;
        this.booked = new boolean[totalSeats+1];
    }
    public synchronized int bookSeat() {
        for (int i=1;i<=totalSeats;i++) if (!booked[i]) { booked[i]=true; return i; }
        return -1;
    }
    public synchronized boolean cancelSeat(int s) {
        if (s>=1 && s<=totalSeats && booked[s]) { booked[s]=false; return true; }
        return false;
    }
    public int availableSeats() { int c=0; for(int i=1;i<=totalSeats;i++) if(!booked[i]) c++; return c; }
    public String toString(){ return number + " " + name + " (avail=" + availableSeats() + ")"; }
}
