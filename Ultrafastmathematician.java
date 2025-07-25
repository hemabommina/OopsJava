
    import java.util.*;  
  public class Ultrafastmathematician {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        String a = sc.next(), b = sc.next();  
        StringBuilder sb = new StringBuilder();  
        for (int i = 0; i < a.length(); i++)  
            sb.append(a.charAt(i) ^ b.charAt(i));  
        System.out.println(sb);  
    }  
}
