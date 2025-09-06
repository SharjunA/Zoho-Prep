
package library;
public class Book {
    public final String isbn; public String title; public boolean issued=false;
    public Book(String isbn,String title){ this.isbn=isbn; this.title=title; }
    public String toString(){ return isbn+":"+title+(issued?" [OUT]":" [IN]"); }
}
