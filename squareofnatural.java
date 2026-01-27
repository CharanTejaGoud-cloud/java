import java.util.Scanner;

class squareofnatural{
    public static int square(int n){
       int sum=0;
       for(int i=1;i<=n;i++){
        sum=sum+i*i;
       }
    
       return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=square(n);
        System.out.println(result);
    }
}
// this is the code for squaresum of natural numbers