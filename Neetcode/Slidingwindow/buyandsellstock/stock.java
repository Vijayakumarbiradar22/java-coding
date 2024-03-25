package Neetcode.Slidingwindow.buyandsellstock;
import java.util.*;
public class stock {
    public static int maxProfit(int prices[]){
        int lsf=Integer.MAX_VALUE;
        int op=0;
        int pist=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            pist=prices[i]-lsf;
            if(op<pist){
                op=pist;
            }
        }
        return op;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of days:");
        int n=sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices on each day:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int result=maxProfit(prices);
        System.out.println(result);
        sc.close();
    } 
}
