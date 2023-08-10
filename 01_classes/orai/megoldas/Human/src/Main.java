public class Main {
    public static void main(String[] args) {

        Child childWithValue = new Child("Karcsika", 6);
       Adult adultWithValues = new Adult("Károly", "magyar", 41, true, 434.432, childWithValue);
        System.out.println(adultWithValues);
    }
}