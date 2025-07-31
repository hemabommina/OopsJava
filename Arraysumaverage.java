import java.util.Scanner;

public class Arraysumaverage {
    public static void main(String[] args) {
        int n1=6;
        int [] arr=new int[n1];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n1;i++){
            System.out.println(i+":"+arr[i]);
            sum+=arr[i];
        }
        System.out.println("sum of the array is "+sum);
        System.out.println("average of the array is "+sum/n1);
    }
}