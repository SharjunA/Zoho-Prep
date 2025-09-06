
package railway;
import java.util.*;
public class ReservationSystem {
    private final Map<String, Train> trains = new HashMap<>();
    private final Map<String, Booking> bookings = new HashMap<>();
    public void addTrain(Train t){ trains.put(t.number,t); }
    public List<Train> search(){ return new ArrayList<>(trains.values()); }
    public Booking book(String trainNo, String passenger){
        Train t = trains.get(trainNo);
        if(t==null) throw new IllegalArgumentException("no train");
        int seat = t.bookSeat();
        if(seat==-1) throw new IllegalStateException("full");
        String id = UUID.randomUUID().toString().substring(0,8);
        Booking b = new Booking(id, trainNo, passenger, seat);
        bookings.put(id,b);
        return b;
    }
    public boolean cancel(String bookingId){
        Booking b = bookings.remove(bookingId);
        if(b==null) return false;
        Train t = trains.get(b.trainNo);
        return t.cancelSeat(b.seat);
    }
}
