public class Patternanother {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print star at borders only
                if (i == 1 || j == 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}
    


