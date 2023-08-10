
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Paulo Coelho", "Brida");
        Book book2 = new Book("Jo Nesbo", "Vérhold");
        Book book3 = new Book("Stieg Laarson", "A tetovált lány");
        Book book4 = new Book("Homérosz", "Íliász");
        Book book5 = new Book("Teszt Elek", "Teszt könyv");

        Library.handleBookList();
        Library.handleTilteSet();
        Library.handleBookMap();
        Library.handleBookMapByAuthor();


    }
}