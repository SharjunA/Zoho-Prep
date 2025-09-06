
public class Main {
    public static void main(String[] args) {
        Controller c = new Controller(3);
        System.out.println(c);
        System.out.println("Assigned: " + c.assign(5));
        System.out.println("Assigned: " + c.assign(2));
        System.out.println(c);
    }
}
