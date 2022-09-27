package classes.book.comparators;

import classes.book.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int comparatorResult = 0;
        if (book1.getPrice() > book2.getPrice()) {
            comparatorResult = 1;
        } else if(book1.getPrice() < book2.getPrice()) {
            comparatorResult = -1;
        }
        return comparatorResult;
    }
}
