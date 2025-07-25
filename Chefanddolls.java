
    import java.util.*;
public class Chefanddolls {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), res = 0;
            for (int i = 0; i < n; i++)
                res ^= s.nextInt();
            System.out.println(res);
        }
    }
}
