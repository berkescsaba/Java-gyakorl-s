public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        Library.addToBookMap(this);
        Library.addToBookMapByAuthor(this);
        Library.addToBookList(this);
        Library.addToBookSet(this);
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
