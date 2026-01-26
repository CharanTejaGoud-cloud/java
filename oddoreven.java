import java.util.Scanner;

class oddoreven{
    public static void function(int n){
   if(n%2==0){
    System.out.println("number is even");;
   }
   else{
    System.out.println("number is odd");
   }
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        function(n);
    }
}