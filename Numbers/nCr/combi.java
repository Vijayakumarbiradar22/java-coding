package Numbers.nCr;
import java.util.Scanner;
public class combi {
    // public static int fact(int n){
    //     int factorial=1;
    //     for(int i=2;i<=n;i++){
    //         factorial*=i;
    //     }
    //     return factorial;
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        int result = fact(n)/(fact(r)*(fact(n-r)));
        System.out.println(result);
        sc.close();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n:");
        // int n=sc.nextInt();
        // System.out.println("Enter r:");
        // int r=sc.nextInt();
        // int result=fact(n)/(fact(r)*fact(n-r));
        // System.out.println(result);
        //  sc.close();
    }
   
    
}
