import java.util.Scanner;
class thirdlargestarray {
    public static int thirdLargest(int arr[]) {
        // Your code here
         int n= arr.length;
         int largest=Integer.MIN_VALUE;
         int secondlargest=Integer.MIN_VALUE;
         int third=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
             if(arr[i]>largest){
                 largest=arr[i];
             }
         }
         for(int j=0;j<n;j++){
             if(arr[j]>secondlargest &&arr[j]<largest){
                 secondlargest=arr[j];
             }
         }
         for(int k=0;k<n;k++){
             if(arr[k]>third && arr[k]<secondlargest ){
                  third=arr[k];
                  }
         }
        return (third == Integer.MIN_VALUE) ? -1 : third;
        
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
    }
    System.out.println(thirdLargest(arr));
    sc.close();
}
}