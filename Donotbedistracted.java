
    import java.util.*;
public class Donotbedistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            char prev = 0;
            boolean ok = true;
            for (char c : s.toCharArray()) {
                if (c != prev) {
                    if (set.contains(c)) { ok = false; break; }
                    set.add(c);
                    prev = c;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}

