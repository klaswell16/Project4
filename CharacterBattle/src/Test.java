import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stuff");
        String test = scanner.nextLine().toLowerCase();
        System.out.println(test);
    }
}
