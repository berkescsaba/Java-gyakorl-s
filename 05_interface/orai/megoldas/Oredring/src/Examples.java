public class Examples extends Book{

    int numberOfTasks;

    public Examples(String author, String title, int numberOfTasks) {
        super(author, title);
        this.numberOfTasks = numberOfTasks;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public Examples setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
        return this;
    }

    @Override
    public String toString() {
        return "Examples{" +
                "numberOfTasks=" + numberOfTasks +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                "} ";
    }

    @Override
    boolean isDedicating() {
        return false;
    }
}
