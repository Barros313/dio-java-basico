import edu.comparator.Book;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>() {
            {
                add(new Book("Harry Potter and the Philosopher's Stone", "J.K Rowling", 1997));
                add(new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998));
                add(new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 2000));
                add(new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", 2003));
                add(new Book("Harry Potter and the Half Blood Prince", "J.K. Rowling", 2005));
                add(new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", 2007));
            }
        };

        Collections.sort(books);

        for (Book book : books) {
            System.out.println("Título: " + book.getTitle());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Ano: " + book.getYear());
        }
    }
}