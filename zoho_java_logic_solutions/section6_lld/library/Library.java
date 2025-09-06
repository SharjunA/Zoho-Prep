
import java.util.*;
public class Library {
    private final Map<String, Book> books = new HashMap<>();
    private final Map<String, String> loans = new HashMap<>(); // isbn -> memberId
    public void addBook(Book b){ books.put(b.isbn, b); }
    public List<Book> list(){ return new ArrayList<>(books.values()); }
    public boolean checkout(String isbn, String memberId){
        Book b = books.get(isbn);
        if (b == null || b.issued) return false;
        b.issued = true; loans.put(isbn, memberId); return true;
    }
    public boolean checkin(String isbn){
        Book b = books.get(isbn);
        if (b == null || !b.issued) return false;
        b.issued = false; loans.remove(isbn); return true;
    }
}
