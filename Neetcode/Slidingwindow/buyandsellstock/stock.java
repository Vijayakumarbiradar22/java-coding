package Neetcode.Slidingwindow.buyandsellstock;
import java.util.*;
public class stock {
    public static int maxProfit(prices[]){
        int lsf=Integer.MAX_VALUE;
        int op=0;
        int pist=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            pist=prices[i]-lsf;
            
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int result=maxProfit(prices);
        System.out.println(result);
        sc.close();
    } 
}
