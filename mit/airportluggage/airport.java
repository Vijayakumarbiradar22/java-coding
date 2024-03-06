package mit.airportluggage;
import java.util.Scanner;
public class airport {
    public static int weightMachine(int n,int weights[],int t){
        int amount=0;
        for(int i=0;i<n;i++){
            amount++;
            if(weights[i]>t){
                amount++;
            }
        }
        return amount;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        int weights[]=new int[n];
        System.out.println("Enter the weights of luggage:");
        for(int i=0;i<n;i++){
            weights[i]=sc.nextInt();
        }
        System.out.println("Enter the T:");
        int t=sc.nextInt();
        System.out.println(weightMachine(n,weights,t));
        sc.close();
    }
}
