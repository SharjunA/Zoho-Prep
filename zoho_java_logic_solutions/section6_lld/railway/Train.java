
public class Train {
    public final String number;
    public final String name;
    public final int totalSeats;
    private boolean[] booked;
    public Train(String number, String name, int totalSeats) {
        this.number = number; this.name = name; this.totalSeats = totalSeats;
        this.booked = new boolean[totalSeats + 1]; // 1-indexed
    }
    public int availableSeats() {
        int c = 0; for (int i = 1; i <= totalSeats; i++) if (!booked[i]) c++;
        return c;
    }
    public int bookSeat() {
        for (int i = 1; i <= totalSeats; i++) if (!booked[i]) { booked[i] = true; return i; }
        return -1;
    }
    public boolean cancelSeat(int seatNo) {
        if (seatNo < 1 || seatNo > totalSeats || !booked[seatNo]) return false;
        booked[seatNo] = false; return true;
    }
    @Override public String toString() { return number + " - " + name + " (avail: " + availableSeats() + ")"; }
}
