package homework5;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class Library {

    //instance variables
    private String libraryName;

    private List<Book> bookList;
    private ListIterator<Book> iter;

    //constructor
    public Library(String name) {
        libraryName = name;
        this.bookList = new LinkedList<>();
        this.iter = bookList.listIterator();
    }

    //other methods
    public void addBook(Book newBook) {
        if (!bookList.contains(newBook)) {
            bookList.add(newBook);
        }
    }

    public void removeBook(Book bookToRemove) {
        if (bookList.contains(bookToRemove)) {
            bookList.remove(bookToRemove);
        }
    }

    //Print method
    public String toString() {
        String out = libraryName + " has the following books: ";
        while (iter.hasNext()) {
            out += "  " + "\n" + iter.hasNext();
        }
        return out;
    }
}