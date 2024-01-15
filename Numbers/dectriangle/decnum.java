package Numbers.dectriangle;
import java.util.Scanner;
public class decnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;j<=i;j++){
                System.out.print(j+" ");
            }
        }

    }
    
}
