public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        for (int i = 0; i < 10; i++) {
            books[i] = new Book();
            books[i].setAuthor(String.valueOf(i));
            books[i].setName(String.valueOf(i));
        }
        books[5].setAuthor("azaz");
        books[5].setName(String.valueOf(5));

        books[7].setAuthor("azaz");
        books[7].setName(String.valueOf(7));


        Library library = new Library(books);
        for (Book book: library.findByAuthor("azaz")) {
            System.out.println(book);
        }


    }
}
