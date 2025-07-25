abstract class Animals {
    abstract void makesound();
    void sleep(){
        System.out.println("zzzzz...");
    }
}
class Doggg extends Animals{
        public  void makesound(){
            System.out.println("woofff");

        }
    }
class Cattt extends Animals{
        public void makesound(){
            System.out.println("meoww");

        }
    }
    


public class Abstractclass {
    public static void main(String[] args) {
        Doggg d=new Doggg();
        Cattt c=new Cattt();
        d.makesound();
        d.sleep();
        c.makesound();
        c.sleep();
    }
    
}
