
package railway;
public class Main {
    public static void main(String[] args) {
        ReservationSystem rs = new ReservationSystem();
        rs.addTrain(new Train("12627","Karnataka Exp",3));
        rs.addTrain(new Train("22691","Rajdhani",2));
        System.out.println("Trains:");
        for(Train t: rs.search()) System.out.println(" - " + t);
        Booking b = rs.book("12627","Sharjun");
        System.out.println("Booked -> " + b);
        System.out.println("Cancel -> " + rs.cancel(b.id));
    }
}
