// User function Template for 
import java.util.Scanner; 

class Kthsmallest {
    public static int kthSmallest(int[] arr, int k) {
        // Your code 
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=arr[0];
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
                
            }
            int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
        }
        return arr[k-1];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int s=sc.nextInt();
        int[] arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(kthSmallest(arr,k));
        sc.close();
        }
    }
