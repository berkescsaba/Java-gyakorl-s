import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Months month = Months.getByNumber(input);
        if(month == null){
            System.out.println("Nincs ilyen hónap!");
        }
        else System.out.println(month);
    }
}