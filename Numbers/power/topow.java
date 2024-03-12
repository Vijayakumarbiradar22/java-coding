package Numbers.power;
import java.util.Scanner;
public class topow {

    // public static int findPower(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }

    //     if(x==0){
    //         return 0;
    //     }

    //     if(n%2==0){
    //         return findPower(x,n/2) * findPower(x,n/2);
    //     }
    //     else {
    //         return findPower(x,n/2) * findPower(x,n/2) *x;
    //     }
        

    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x:");
        int x=sc.nextInt();
        

        sc.close();
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter x:");
        //     int x = sc.nextInt();
        //     System.out.println("Enter n:");
        //     int n = sc.nextInt();
        //     int result = findPower(x,n);
        //     System.out.println(result);
        // sc.close();
    }
}
