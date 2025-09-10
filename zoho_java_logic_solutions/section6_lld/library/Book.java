public class Book {
    public final String isbn; 
    public String title; 
    public boolean issued;

    public Book(String isbn, String title){ 
        this.isbn = isbn; 
        this.title = title; 
    }

    @Override 
    public String toString(){ 
        return isbn + ":" + title + (issued? " [OUT]" : " [IN]"); 
    }
}
