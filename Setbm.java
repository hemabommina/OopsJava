import java.util.*;
public class Setbm {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        int newno=bitmask|n;
        System.out.println(newno);
    }
    
}
