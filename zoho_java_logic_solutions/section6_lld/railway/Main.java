
public class Main {
    public static void main(String[] args) {
        ReservationSystem rs = new ReservationSystem();
        rs.addTrain(new Train("12627", "Karnataka Exp", 3));
        rs.addTrain(new Train("22691", "Rajdhani", 2));
        System.out.println("Trains:");
        for (Train t : rs.search()) System.out.println(" - " + t);
        var b1 = rs.book("12627", "Sharjun");
        System.out.println("Booked: " + b1);
        System.out.println("After booking: " + rs.search().get(0));
        boolean cancelled = rs.cancel(b1.id);
        System.out.println("Cancelled? " + cancelled);
    }
}
