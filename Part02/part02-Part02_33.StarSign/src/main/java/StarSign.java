public class StarSign {

    public static void main(String[] args) {           
        printStars(5);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
    }

    public static void printStars(int number) {
        for (int i = number; i > 0; i--) {
            System.out.print("*");  
        }
        System.out.print("\n");
    }

    public static void printSquare(int size) {
        for (int i = size; i > 0; i--) {
            printStars(size);           
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = height; i > 0; i--) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
