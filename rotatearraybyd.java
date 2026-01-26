public class rotatearraybyd {
      static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n-d;i++){
            temp[i]=arr[d+i];
        }
        for(int i=0;i<d;i++){
            temp[n-d+i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
