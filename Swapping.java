public class Swapping {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int i=1;
        int j=3;
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}
