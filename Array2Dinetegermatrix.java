
import java.util.*;

public class Array2Dinetegermatrix {

public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
}
