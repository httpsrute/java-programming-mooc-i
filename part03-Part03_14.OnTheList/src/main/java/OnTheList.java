import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> names = new ArrayList<>();
            
            while (true) {
                String input = scanner.nextLine();

                if (input.equals("")) {
                    break;
                }

                names.add(input);
            }
            
            if (names.isEmpty()) {
                System.out.println("No names entered.");
                return;
            }
            
            System.out.println("Search for?");
            String search = scanner.nextLine();
            
            if (names.contains(search)) {
                System.out.println(search + " was found!");
            } else {
                System.out.println(search + " was not found!");
            }
        }
    }
}
