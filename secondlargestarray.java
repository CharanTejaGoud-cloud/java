import java.util.Scanner;
import java.util.Arrays;
class secondlargestarray {
    public static int getSecondLargest(int[] arr) {
        // code here
        int n= arr.length;
        Arrays.sort(arr);
        int largest=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]<largest){
                return arr[i];
            }
        }
            return -1;
        
    };
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getSecondLargest(arr));
        sc.close();
        
    }
}