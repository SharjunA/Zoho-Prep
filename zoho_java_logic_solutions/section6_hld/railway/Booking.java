
package railway;
public class Booking {
    public final String id; public final String trainNo; public final String passenger; public final int seat;
    public Booking(String id, String trainNo, String passenger, int seat){ this.id=id; this.trainNo=trainNo; this.passenger=passenger; this.seat=seat; }
    public String toString(){ return id + ":" + trainNo + ":" + passenger + ":seat#" + seat; }
}
