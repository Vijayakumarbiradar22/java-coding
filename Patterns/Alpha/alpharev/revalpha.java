package Patterns.Alpha.alpharev;
import java.util.Scanner;
public class revalpha {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int n=sc.nextInt();
        char alpha=65;
        for(int i=1;i<=n;i++){
            for(char j=alpha;j<='E';j++){
                System.out.print(j);
                // alpha++;
            }
            System.out.println();
        }
        sc.close();
    }
}
