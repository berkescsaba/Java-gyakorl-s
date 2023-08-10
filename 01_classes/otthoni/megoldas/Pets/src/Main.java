public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buksi", 2, true, 6);
        Cat cat = new Cat("Cirmi", 3, "pink", dog);

        System.out.println(dog);
        System.out.println(cat);
    }
}