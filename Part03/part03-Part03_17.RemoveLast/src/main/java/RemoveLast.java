import java.util.Scanner;
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> strings = new ArrayList<>();

            while (true) {
                String input = scanner.nextLine();

                if (input.equals("")) {
                    break;
                }

                strings.add(input);
            }

            System.out.println(strings);
            removeLast(strings);
            removeLast(strings);
            System.out.println(strings);
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        }

        for (int i = 0; i < strings.size() - 1; i++) {
            strings.remove(strings.size() - 1);
        }
    }
}
