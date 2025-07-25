class person{
    String name;
    int age;
    void displayperson(){

        System.out.println("name: " + name);
        System.out.println( "age: " + age);
    }
}
class student extends person{
    int rollno;
    void displayperson(){
        super.displayperson();
        System.out.println("rollno : " + rollno);
    }
}
public class Overriding {
    public static void main(String[] args) {
        student s = new student();
        s.name ="Hema";
        s.age = 21;
        s.rollno = 11;
        s.displayperson();
    }
}


    

