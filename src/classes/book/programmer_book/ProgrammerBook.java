package classes.book.programmer_book;

import classes.book.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String language, int level, String title, String author, int price, String isbn13) {
        super(title, author, price, isbn13);
        this.language = language;
        this.level = level;

    }
    public ProgrammerBook(String language, int level, String title, String author, int price, String isbn13, int edition) {
        super(title, author, price, isbn13, edition);
        this.setLanguage(language);
        this.setLevel(level);
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public boolean equals(Object obj) {
        boolean areTheSame = false;
        if(obj.getClass() == getClass()){
            ProgrammerBook comparedBook = (ProgrammerBook)obj;
            areTheSame = this.language.equals(comparedBook.language) &&
                    this.level == comparedBook.level &&
                    this.getTitle().equals(comparedBook.getTitle()) &&
                    this.getAuthor().equals(comparedBook.getAuthor()) &&
                    this.getPrice() == comparedBook.getPrice() &&
                    this.getIsbn13().equals(comparedBook.getIsbn13());
        }
        return areTheSame;
    }
    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime*result + ((language == null) ? 0 : language.hashCode());
        result = prime*result + level;
        return result;
    }
    @Override
    public String toString() {
        return "ProgrammerBook { " + "language = " + this.language +
                ", level = " + this.level +
                ", title = " + this.getTitle() +
                ", author = " + this.getAuthor() +
                ", price = " + this.getPrice() +
                ", isbn13 = " + this.getAuthor() +
                ", edition = " + this.getEdition()+
                " }";
    }
}
