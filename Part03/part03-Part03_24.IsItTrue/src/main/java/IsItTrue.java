import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Give a string:");
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                System.out.println("No string entered.");
            } else {
                if (string.equals("true")) {
                    System.out.println("You got it right!");
                } else {
                    System.out.println("Try again!");
                }
            }
        }
    }
}
