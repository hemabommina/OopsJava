import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("choose operation :");
    System.out.println("ADD");
    System.out.println("SUB");
    System.out.println("MUL");
    System.out.println("DIV");
    System.out.println("enter your choice :");
    String choice = sc.next();
    System.out.println("enter a number a");
    int a = sc.nextInt();
    System.out.println("enter a number b");
    int b = sc.nextInt();
    sc.close();
    switch (choice) {
        case "ADD":
        System.out.println("add :" + (a+b));
        break;
        case "SUB":
        System.out.println("sub :" + (a-b));
        break;
        case "MUL":
        System.out.println("mul:" + (a*b));
        break;
        case "DIV":
        System.out.println("div:" +(a/b));
        break;
        default:
        System.out.println("invalid choice");

    }
}   
}

        
