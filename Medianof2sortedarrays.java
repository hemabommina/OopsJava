
    import java.util.*;
public class Medianof2sortedarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];
        System.arraycopy(arr1, 0, merged, 0, n1);
        System.arraycopy(arr2, 0, merged, n1, n2);

        Arrays.sort(merged);

        int totalLength = merged.length;
        double median;

        if (totalLength % 2 == 0) {
            median = (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        } else {
            median = merged[totalLength / 2];
        }

        System.out.println(median);  // <-- Print the double value
    }
}

