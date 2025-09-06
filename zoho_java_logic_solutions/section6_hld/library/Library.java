
package library;
import java.util.*;
public class Library {
    private final Map<String, Book> books = new HashMap<>();
    public void add(Book b){ books.put(b.isbn,b); }
    public List<Book> list(){ return new ArrayList<>(books.values()); }
    public boolean checkout(String isbn){ Book b=books.get(isbn); if(b==null||b.issued) return false; b.issued=true; return true; }
    public boolean checkin(String isbn){ Book b=books.get(isbn); if(b==null||!b.issued) return false; b.issued=false; return true; }
}
