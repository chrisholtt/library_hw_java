import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public String add(Book book){
        if (this.getBookCount() < this.capacity) {
            this.stock.add(book);
            return "Book added";
        }
        return "Book cannot be added";
    }

    public int getBookCount(){
        return this.stock.size();
    }

}
