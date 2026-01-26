import java.util.Scanner;
import java.util.ArrayList;

// public class table {
//     public static void table(int n){
     
//         for (int j=1;j<11;j++){
//             System.out.println(+n+"*"+j+"="+n*j);
//         }
     
//     }
//     public static void main(){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       table(n);
//     }
// }

 // User function Template for Java
class table {
    static ArrayList<Integer> getTable(int n) {
    ArrayList<Integer> list=new ArrayList<>();
        for(int j=1;j<=10;j++){
            list.add(n*j);
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> result=getTable(n);
        for(Integer i:result){
            System.out.println(i);
        }
    }
}