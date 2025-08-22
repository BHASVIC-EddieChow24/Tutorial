import java.util.ArrayList;

public class Book {
    public String title;
    public String author;

    public String toString(){
        return String.format("%s by %s", this.title, this.author);
    }
    public void borrow(Book book){
        this.books.add(book);
    }
}


