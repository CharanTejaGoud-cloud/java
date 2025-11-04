public class ArrayReverse{
    static void reversearray(int[] arr){
        int n =arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[n-i-1];
        }
            for(int i=0;i<n;i++){
            arr[i]=temp[i];
            }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reversearray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
    }
}
// we also solve this problem in two pointers and swapping in two pointer method declare two variables left and right decrease right i.e right-- and increse left i.e left++
// in any method declare at temp variable and store the left value then copy right to left and temp value is stored in the right