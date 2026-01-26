import java.util.Scanner;
import java.util.Arrays;
class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
          if(nums[i]==nums[i+1]){
            return true;
          }
        
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
        sc.close();
    }
}