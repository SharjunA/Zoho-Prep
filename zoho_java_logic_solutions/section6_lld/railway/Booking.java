public class Booking {
    public final String id;
    public final String trainNo;
    public final String passengerName;
    public final int seatNo;

    public Booking(String id, String trainNo, String passengerName, int seatNo) {
        this.id = id; 
        this.trainNo = trainNo; 
        this.passengerName = passengerName; 
        this.seatNo = seatNo;
    }

    @Override 
    public String toString() {
        return "Booking{" + id + ", train=" + trainNo + ", passenger=" + passengerName + ", seat=" + seatNo + "}";
    }
}
