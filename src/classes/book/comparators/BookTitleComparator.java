package classes.book.comparators;

import classes.book.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareToIgnoreCase(book2.getTitle());
    }
}
