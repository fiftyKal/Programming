package homework5;

import java.util.LinkedList;

public class LibraryTester {
    public static void main(String[] args) {

        Library southSide = new Library("South Side");
        System.out.println(southSide);
        LinkedList<Book> southSideBooks = new LinkedList<>();
        southSideBooks.add(new Book("Gone with the Wind", "Mitchell", 3));
        System.out.print(southSideBooks);
        System.out.println("\n");
        southSideBooks.add(new Book("Pride and Prejudice", "Austin", 4));
        System.out.println(southSideBooks.get(1));
    }
}