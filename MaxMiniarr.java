public class MaxMiniarr {
    static int min(int[] arr){
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
        if(arr[i]<min){
          min=arr[i];
       }
    }
    return min;

    }
    static int max(int[] arr){
       int n=arr.length;
       int max=arr[0];
       for(int i=0;i<n;i++){
         if(arr[i]>max){
            max=arr[i];
         }
       }
       return max;
    }
    public static void main(String[] args) {
        int[] arr={5,2,3,4,5};
        
        System.out.println("minimum element in the array is "+min(arr));
        System.out.println("maximum element in the array is "+max(arr));
        

    }
}
