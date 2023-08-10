public class Main {
    static Book[] books = new Book[10];
    static int numberofBooks = 0;
    static CD[] cds = new CD[10];
    static int numberOfCDs = 0;

    public static void main(String[] args) {
        Novel novel = new Novel("Author", "title", "summary of the novel comes here");
        CD cd = new CD("CDAuthor", "CDTitle");
        Examples examples = new Examples("exAuth", "ex title", 3);

        pickUpOrder(novel);
        pickUpOrder(cd);
        pickUpOrder(examples);
        order();
    }

    public static void pickUpOrder(Object object) {
        if (object instanceof Book) {
            books[numberofBooks] = (Book) object;
            numberofBooks++;
        } else if (object instanceof CD) {
            cds[numberOfCDs] = (CD) object;
            numberOfCDs++;
        }

    }

    public static void order() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i] instanceof Novel) {
                Novel novel = (Novel) books[i];
                novel.order(3);
            }
        }
        for (int i = 0; i < cds.length; i++) {
            if (cds[i] != null) {
                CD cd = (CD) cds[i];
                cd.order(6);
            }
        }
    }

}