package classes.book;


public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private String author;
    private int price;
    private String isbn13;
    private static int edition;

    public Book(){}
    public Book(String title, String author, int price, String isbn13, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;

        //this.isbn13 = isbn13;
        this.isbn13 = extractIsbn(isbn13);
        Book.edition = edition;
    }
    public Book(String title, String author, int price, String isbn13) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn13 = extractIsbn(isbn13);
    }
    private String extractIsbn(String isbn13) {
        StringBuilder currentIsbn = new StringBuilder();
        int stringLen = isbn13.length();
        for(int i = 0; i < stringLen && currentIsbn.length() < 14; i++){
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
        if(obj.getClass().getSimpleName().equals("Book")){
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
        book.title = this.title;
        book.price = this.price;
        book.author = this.author;
        return book;
    }

    //task_15
    @Override
    public int compareTo(Book book) {
        return this.isbn13.compareTo(book.isbn13);
    }
    public String getTitle() {
        return  this.title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
