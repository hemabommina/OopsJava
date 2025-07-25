class Student{
    String name;
    int rno;
    char grade;
    public void displaydetails(){
        System.out.println("The name of the student is :  "+name);
        System.out.println("The roll number of the student is :  "+rno);
        System.out.println("Grade of the student is :  "+grade);
    }
}
public class Studentdetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Hema";
        s1.rno = 11;
        s1.grade = 'A';
        s1.displaydetails();
    }
}

