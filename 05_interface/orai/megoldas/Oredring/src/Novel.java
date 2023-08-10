public class Novel extends Book implements Ordering{

    private String summary;

    public Novel(String author, String title, String summary) {
        super(author, title);
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public Novel setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @Override
    boolean isDedicating() {
        return true;
    }

    @Override
    public void order(int numberToBeOrdered) {
        System.out.println("Needs to be ordered: " + numberToBeOrdered + " from: " + this);
    }

    @Override
    public String toString() {
        return "Novel{" +
                "summary='" + summary + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                "} ";
    }
}
