package task_12.main;

import classes.book.Book;
import classes.book.output.PrintBook;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("The dark tower", "Stephen King", 20, "9780340881156", 10);
        Book book_2 = new Book("The Last Wish", "Andrzej Sapkowski", 25, "9781478933335");
        Book book_3 = new Book("The dark tower", "Stephen King", 20, "9780340881156");
        PrintBook.printComparisonBook(book_1, book_2);
        PrintBook.printComparisonBook(book_2, book_3);
        PrintBook.printComparisonBook(book_1, book_3);
    }

}
