public class AdvancedAstrology {

    public static void main(String[] args) {
        printTriangle(4);
        System.out.println("\n---");
        christmasTree(10);
    }

    public static void printStars(int number) {
        for (int count = 0; count < number; count++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        for (int row = size; row > 0; row--) {
            printSpaces(row - 1);
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int stars = 1;
        for (int row = height; row > 0; row--) {
            printSpaces(row - 1);
            printStars(stars);
            stars += 2;
        }

        for (int base = 0; base < 2; base++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}
