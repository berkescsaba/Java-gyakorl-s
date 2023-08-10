import java.util.*;

public abstract class Library {

    private static List<Book> bookList = new ArrayList<>();
    private static Set<String> titleSet = new HashSet<>();
    private static Map<Integer, Book> bookMap = new HashMap<>();
    private static Map<String, Book> bookMapByAuthor = new HashMap<>();

    public static void addToBookList(Book book){
        bookList.add(book);
    }

    public static void handleBookList(){
        System.out.println("My book list: " + bookList);
        for (Book book: bookList) {
            System.out.println(book);
        }
        System.out.println(bookList.get(0));
        System.out.println(bookList.get(1).getTitle());
        System.out.println(bookList.get(2).getAuthor());

        bookList.remove(bookList.get(2));
        bookList.removeIf(book -> book.getAuthor().equals("Jo Nesbo"));
        bookList.get(bookList.size()-1).setAuthor("Új szerző");
        System.out.println(bookList);
//        bookList.sort((Book b1,  Book b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
        bookList.sort(Comparator.comparing(Book::getAuthor));
        System.out.println(bookList);
        System.out.println("====================================================");
    }

    public static void addToBookSet(Book book){
        titleSet.add(book.getTitle());
    }

    public static void handleTilteSet(){
        System.out.println("My book set: " + titleSet);
        titleSet.remove("Vérhold");
        System.out.println("Brida szerepel-e? = " + titleSet.contains("Brida"));
        System.out.println("After remove" + titleSet);
        System.out.println("Vérhold szerepel-e? = " + titleSet.contains("Vérhold"));
        System.out.println("====================================================");
    }


    public static void addToBookMap(Book book){
        int mapSize = bookMap.size() + 1;
        bookMap.put(mapSize, book);
    }
    public static void handleBookMap(){
        System.out.println(bookMap);
        System.out.println(bookMap.get(2));
        bookMap.remove(1);
        System.out.println(bookMap);
        System.out.println("====================================================");
    }

    public static void addToBookMapByAuthor(Book book){
        bookMapByAuthor.put(book.getAuthor(), book);
    }

    public static void handleBookMapByAuthor(){
        System.out.println(bookMapByAuthor);
        System.out.println(bookMapByAuthor.get("Homérosz"));
        bookMapByAuthor.remove(1);
        System.out.println(bookMapByAuthor);
    }
}
