
    import java.util.Scanner;
import java.util.LinkedHashSet;
public class Removeduplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        LinkedHashSet<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num);
        }

        for (int num : unique) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

