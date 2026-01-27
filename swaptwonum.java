import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class swaptwonum {
    static List<Integer> swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        ArrayList<Integer> result=new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        List<Integer> swapped=swap(a,b);
        System.out.println("After swapping");
        System.out.println("a = " + swapped.get(0));
        System.out.println("b = " + swapped.get(1));
        


    }
}
