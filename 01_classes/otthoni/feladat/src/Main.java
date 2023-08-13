public class Main {
    public static void main(String[] args) {
        Dog eslo = new Dog("Buksi", 5, true, 6);
        System.out.println(eslo);
        Cat masodik = new Cat("Cirmi", 5, "cirmos", eslo);
        System.out.println(masodik);
    }
}