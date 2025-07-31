import java.util.*;
public class Updatebm {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int newnoo=bitmask|n;
        int notbitmask=~(bitmask);
        int newno=notbitmask & n;
        System.out.println(newno);

    }
    
}
