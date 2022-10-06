package task_13.main;

import classes.book.output.PrintBook;
import classes.book.programmer_book.ProgrammerBook;

public class Main {
    public static void main(String[] args) {
        ProgrammerBook programmerBook_1 = new ProgrammerBook("C#", 3, "CLR via C#",
                "Jeffrey Richter", 31, "9780735667457", 6);
        ProgrammerBook programmerBook_2 = new ProgrammerBook("C#", 3, "CLR via C#",
                "Jeffrey Richter", 31, "9780735667457");
        ProgrammerBook programmerBook_3 = new ProgrammerBook("Java", 5,
                "Java Performance: The Definite Guide", "Scott Oaks", 25, "9781449358457");
        PrintBook.printComparisonBook(programmerBook_1, programmerBook_2);
        PrintBook.printComparisonBook(programmerBook_2, programmerBook_3);
        PrintBook.printComparisonBook(programmerBook_3, programmerBook_1);
    }

}
