
    import java.util.Scanner;
    public class TotalsumVJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            long sum = 0;
            long start = Math.min(N, M);
            long end = Math.max(N, M);
            for (long i = start; i <= end; i++) {
                if (i % 3 != 0 && i % 5 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
    

