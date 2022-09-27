package task_15.main;

import classes.book.Book;
import classes.book.output.PrintBook;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("The Gunslinger", "Stephen King", 18, "9780452261341", 10);
        Book book_2 = new Book("The Last Wish", "Andrzej Sapkowski", 25, "9781478933335");
        Book book_3 = new Book("The dark tower", "Stephen King", 20, "9780340881156");
        Book book_4 = new Book("The dark tower", "Stephen King", 5, "9780340881156");
        Book book_5 = new Book("Childhood", "Maxim Gorky", 18, "9785170573684");
        Book book_6 = new Book("Childhood", "Leo Tolstoy", 20, "9785041191801");

        TreeSet<Book> bookTreeSet = new TreeSet<>();
        bookTreeSet.add(book_1);
        bookTreeSet.add(book_2);
        bookTreeSet.add(book_3);
        bookTreeSet.add(book_4);
        bookTreeSet.add(book_5);
        bookTreeSet.add(book_6);

        PrintBook.printBookTreeSet("sorted book list", bookTreeSet);
    }
}
