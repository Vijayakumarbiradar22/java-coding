package Neetcode.Slidingwindow.buyandsellstock;
import java.util.*;
public class stock {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
    }
    
}
