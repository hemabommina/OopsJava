
    import java.util.*;
public class Findtheseries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int res = (n % 2 == 1) ? 1 << (n / 2) : (int)Math.pow(3, (n / 2) - 1);
            System.out.println(res);
        }
    }
}


