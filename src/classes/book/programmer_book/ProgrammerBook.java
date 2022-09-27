package classes.book.programmer_book;

import classes.book.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String language, int level) {
        this.language = language;
        this.level = level;
    }
    @Override
    public boolean equals(Object obj) {
        boolean areTheSame = false;
        if(obj.getClass().getSimpleName().equals("ProgrammerBook")){
            ProgrammerBook comparedBook = (ProgrammerBook)obj;
            areTheSame = this.language.equals(comparedBook.language) &&
                    this.level == comparedBook.level;
        }
        return areTheSame;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime*result + ((language == null) ? 0 : language.hashCode());
        result = prime*result + level;
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammerBook { " + "language = " + this.language +
                ", level = " + this.level +
                " }";
    }
}
