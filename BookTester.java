package classes;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Arrays;

        public class bookTester {

            public void main(String[] args) {
                ArrayList<Book> book = new ArrayList<>();
                book.add(new Book("Hitch Hiker's Guide to the Galaxy", "Douglas Adams", 7.88));
                book.add(new Book("Skin Walkers", "Tony Hillerman", 34.57));
                book.add(new Book("A Dark Wind", "Tony Hillerman", 10.79));
                book.add(new Book("And Then There Were None", "Agatha Christy", 8.99));

                //Sort using the compareTo method in Book by author and then title
                Collections.sort(book,
                        (first, second)-> {
                            if (first.getAuthor().compareTo(second.getAuthor()) < 0) {
                                return -1;
                            }
                            if (first.getAuthor().compareTo(second.getAuthor()) > 0) {
                                return 1;

                            } else {
                                return first.getTitle().compareTo(second.getTitle());
                            }
                            System.out.println(first.getAuthor().compareTo(second.getAuthor());


                            System.out.println(book);
                        });

            }
        }



