public class CD implements Ordering{

    private String author;
    private String title;

    public CD(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public CD setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CD setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return "CD{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public void order(int numberToBeOrdered) {
        System.out.println("Needs to be ordered: " + numberToBeOrdered + " from: " + this);
    }


}
