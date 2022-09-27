package task_16.main;
import classes.book.Book;
import classes.book.comparators.BookAuthorComparator;
import classes.book.comparators.BookPriceComparator;
import classes.book.comparators.BookTitleComparator;
import classes.book.output.PrintBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("The Gunslinger", "Stephen King", 18, "9780452261341", 10);
        Book book_2 = new Book("The Last Wish", "Andrzej Sapkowski", 25, "9781478933335");
        Book book_3 = new Book("The dark tower", "Stephen King", 20, "9780340881156");
        Book book_4 = new Book("The dark tower", "Stephen King", 5, "9780340881156");
        Book book_5 = new Book("Childhood", "Maxim Gorky", 18, "9785170573684");
        Book book_6 = new Book("Childhood", "Leo Tolstoy", 20, "9785041191801");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book_1);
        bookList.add(book_2);
        bookList.add(book_3);
        bookList.add(book_4);
        bookList.add(book_5);
        bookList.add(book_6);

        Comparator<Book> titleComparator = new BookTitleComparator();
        Comparator<Book> authorComparator = new BookAuthorComparator();
        Comparator<Book> titleAuthorComparator = titleComparator.thenComparing(authorComparator);
        Comparator<Book> authorTitleComparator = authorComparator.thenComparing(titleComparator);
        Comparator<Book> authorTitlePriceComparator = authorTitleComparator.thenComparing(new BookPriceComparator());

        bookList.sort(titleComparator);
        PrintBook.printBookList("books sorted by title", bookList);
        bookList.sort(authorComparator);
        PrintBook.printBookList("books sorted by author", bookList);
        bookList.sort(titleAuthorComparator);
        PrintBook.printBookList("books sorted by title and author", bookList);
        bookList.sort(authorTitleComparator);
        PrintBook.printBookList("books sorted by author and title", bookList);
        bookList.sort(authorTitlePriceComparator);
        PrintBook.printBookList("books sorted by author, title and price", bookList);
    }
}
