package mit.maxtoys;
import java.util.Scanner;
public class toys {
    public static int getMaxToys(int prices[],int money){
        int sum=0,count=0,max=0;

        for(int i=0;i<prices.length;i++){
            sum=count=0;
            for(int j=i;j<prices.length;j++){
                if((sum+prices[j])<=money){
                    sum=sum+prices[j];
                    count=count+1;
                    max=Math.max(count,max);
                } else {
                    count=0;
                    sum=0;
                    break;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] prices=new int[n];
        System.out.println("Enter the toys price:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println("Enter the money:");
        int money=sc.nextInt();
        System.out.println(getMaxToys(prices,money));
        sc.close();
    }
    
}
