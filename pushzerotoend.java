import java.util.Arrays;

class pushzerotoend {
    static void pushZerosToEnd(int[] arr) {
        // code here
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
            }
            while(count<arr.length){
                arr[count++]=0;
        
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,5,0,9,0,7};
        pushZerosToEnd(arr);
    System.out.println(Arrays.toString(arr));
    }
}