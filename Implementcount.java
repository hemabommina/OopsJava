class Counter{
    static int count = 0;
    Counter(){
        count=count+1;
    }
    static int getCount(){
        return count;


    }
    }
public class Implementcount {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.getCount());
    }
    
}
