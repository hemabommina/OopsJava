class Student{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge>0){
            age=newAge;
        }
        else{
            System.out.println("Age must be positive!");
        }
        }
        }
public class Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Hema");
        s1.setAge(21);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

