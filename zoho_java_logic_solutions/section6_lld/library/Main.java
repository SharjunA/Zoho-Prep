public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("978-0-12", "DSA in Java"));
        lib.addBook(new Book("978-0-34", "Clean Code"));
        
        System.out.println("Books: " + lib.list());
        System.out.println("Checkout Clean Code: " + lib.checkout("978-0-34", "M1"));
        System.out.println("Books: " + lib.list());
        System.out.println("Return: " + lib.checkin("978-0-34"));
    }
}
