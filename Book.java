package classes;

public class Book {
    // Instance Variables
    public static String title;
    public static String author;
    private double price;


    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Other Methods
    public void getAuthor() {
        this.author = author;
    }

    public void getTitle() {
        this.title = title;
    }
    public void getPrice() { this.price = price;}

    public int compareTo(Book second) {
        if (this.author.compareTo(second.author) == 0) {
            return this.title.compareTo(second.title);
        } else {
            return this.author.compareTo(second.author);
        }
    }

    public int compareTitle(Book other) {
        return this.title.compareTo(other.title);
    }
    // toString Method
    public String toString() {
        return title + " by " + author + " costs " + price;
    }
}
