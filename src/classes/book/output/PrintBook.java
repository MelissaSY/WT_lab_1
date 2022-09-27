package classes.book.output;

import classes.book.Book;

import java.util.ArrayList;
import java.util.TreeSet;

public class PrintBook {
    public static void printBookList(String arrayName, ArrayList<Book> bookArrayList) {
        System.out.printf("%s:", arrayName);
        for (Book a:
                bookArrayList) {
            System.out.format("\n%s\n", a);
        }
        System.out.println();
    }
    public static void printBookTreeSet(String treeSetName, TreeSet<Book> bookTreeSet) {
        System.out.printf("%s:", treeSetName);
        for (Book a:
                bookTreeSet) {
            System.out.format("\n%s\n", a);
        }
        System.out.println();
    }
    public static void printComparisonBook(Book book_1, Book book_2){
        if(book_1.equals(book_2)){
            System.out.printf("%s\nand\n%s\nare the same book ",book_1, book_2);
        }
        else {
            System.out.printf("%s\nand\n%s\nare not the same book ",book_1, book_2);
        }
        if(book_1.hashCode() == book_2.hashCode()){
            System.out.println("and have the same hashcode");
        }else {
            System.out.println("and have different hashcodes");
        }
        System.out.println();
    }
}
