import java.util.ArrayList;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> bookArrayList = new ArrayList<Book>();
        for (int i = 0; i < this.books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                bookArrayList.add(books[i]);
            }
        }
        return bookArrayList;
    }
}
