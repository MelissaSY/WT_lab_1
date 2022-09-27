package task_14.main;

import classes.book.Book;
import classes.book.output.PrintBook;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("The dark tower", "Stephen King", 20, "9780340881156", 10);
        Book book_2 = (Book)book_1.clone();
        PrintBook.printComparisonBook(book_1, book_2);
    }
}

