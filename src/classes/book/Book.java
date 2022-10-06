package classes.book;


public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private String author;
    private int price;
    private String isbn13;
    private static int edition;

    public Book(){}

    public Book(String title, String author, int price, String isbn13) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
        this.setIsbn13(isbn13);
    }
    public Book(String title, String author, int price, String isbn13, int edition) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
        this.setIsbn13(isbn13);
        this.setEdition(edition);
    }
    private String extractIsbn13(String isbn13) {
        StringBuilder currentIsbn = new StringBuilder();
        int stringLen = isbn13.length();
        for(int i = 0; i < stringLen && currentIsbn.length() < 13; i++){
            if(isbn13.charAt(i) >= '0' && isbn13.charAt(i) <= '9'){
                currentIsbn.append(isbn13.charAt(i));
            }
        }
        stringLen = currentIsbn.length();
        currentIsbn.append("0".repeat(Math.max(0, 13 - stringLen)));
        return currentIsbn.toString();
    }


    //task_12
    @Override
    public boolean equals(Object obj) {
        boolean areTheSame = false;
        if(obj.getClass() == getClass()){
            Book comparedBook = (Book)obj;
            areTheSame = this.title.equals(comparedBook.title) &&
                        this.author.equals(comparedBook.author) &&
                        this.price == comparedBook.price &&
                        this.isbn13.equals(comparedBook.isbn13);

        }
        return areTheSame;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime*result +((title == null) ? 0: title.hashCode());
        result = prime*result + ((author == null) ? 0: author.hashCode());
        result = prime*result + ((isbn13 == null) ? 0: isbn13.hashCode());
        result = prime*result + prime;
        return result;
    }

    @Override
    public String toString() {
        return "Book { " + "author = " + this.author +
                ", title = " + this.title +
                ", price = " + this.price +
                ", isbn-13 = " + this.isbn13 +
                ", edition = " + Book.edition +
                " }";
    }

    //task_14
    public Object clone() {
        Book book = new Book();
        try {
            book = (Book)super.clone();
        } catch (CloneNotSupportedException ignored) {}

        book.title = this.title;
        book.price = this.price;
        book.author = this.author;
        return book;
    }


    public String getTitle() {
        return  this.title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn13() {
        return this.isbn13;
    }
    public int getPrice() {
        return price;
    }
    public int getEdition() {
        return Book.edition;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        if(price > 0) {
            this.price = price;
        }
    }
    public void setIsbn13(String isbn13) {
        this.isbn13 = extractIsbn13(isbn13);
    }
    public void setEdition(int edition) {
        Book.edition = edition;
    }

    //task_15
    @Override
    public int compareTo(Book book) {
        return this.isbn13.compareTo(book.isbn13);
    }
}
