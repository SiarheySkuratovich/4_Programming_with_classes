public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int publishingYear;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public Book() {}

    public Book(int id, String name, String author, String publishingHouse, int publishingYear,
                int numberOfPages, int price, String bindingType) {
        this.id = id;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getBindingType() {
        return bindingType;
    }

    public String getName() {
        return name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
