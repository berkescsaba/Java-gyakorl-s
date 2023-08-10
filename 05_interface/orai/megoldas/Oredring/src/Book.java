public abstract class Book {

    protected String author;
    protected String title;
    abstract boolean isDedicating();

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
}
