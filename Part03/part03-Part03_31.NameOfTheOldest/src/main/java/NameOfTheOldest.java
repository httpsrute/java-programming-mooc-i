import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> ages = new ArrayList<>();
            
            ArrayList<String> names = new ArrayList<>();
            
            int age = 0;
            
            while (true) {
                String input = scanner.nextLine();
                
                if (input.equals("")) {
                    break;
                }
                
                String[] parts = input.split(",");
                
                String name = parts[0];
                age = Integer.valueOf(parts[1]);
                
                ages.add(age);
                names.add(name); 
            }
            
            System.out.println(age);
            
            int oldest = Integer.MIN_VALUE;
            String oldestPerson = "";
            
            for (int i = 0; i < ages.size(); i++) {
                if (ages.get(i) > oldest) {
                    oldest = ages.get(i);
                    oldestPerson = names.get(i);
                }              
            }            
            System.out.println("Name of the oldest: " + oldestPerson);
        }
    }
}