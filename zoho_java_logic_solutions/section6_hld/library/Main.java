
package library;
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book("978-0-12","DSA in Java"));
        lib.add(new Book("978-0-34","Clean Code"));
        System.out.println(lib.list());
        System.out.println("Checkout: " + lib.checkout("978-0-34"));
        System.out.println("Return: " + lib.checkin("978-0-34"));
    }
}
