import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();
                
                if (input.equals("")) {
                    break;
                }
                
                String[] parts = input.split(" ");
                
                for (int i = 0; i < parts.length; i++) {
                    if (i == parts.length - 1) {
                        System.out.println(parts[i]);
                    }
                }
            }
        }
    }
}
