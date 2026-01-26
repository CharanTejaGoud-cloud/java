import java.util.Arrays;
class Solution {
    public static void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length; 

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); 

            // Reverse the sub-array
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,5,0,9,0,7};
        reverseInGroups(arr,3);
    System.out.println(Arrays.toString(arr));
    }
}