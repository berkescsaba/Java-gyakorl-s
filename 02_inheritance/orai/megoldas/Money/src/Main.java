public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin("5 penny", "yellow", 2001);
        System.out.println(coin);

        Cash cash = new Cash("100$", "green", 2020);
        System.out.println(cash);
    }
}