package Neetcode.Stack.carfleet;
import java.util.*;
public class fleet {
    public static int carFleet(int target,int[] position,int[] speed){
        int res=0;
        double[] timeArr = new double[target];
        for(int i=0;i<position.length;i++){
            timeArr[position[i]]=(double)(target-position[i])/speed[i];
        }
        double prev=0.0;
        for(int i=target-1;i>=0;i--){
            double cur=timeArr[i];
            if(cur>prev){
                prev=cur;
                res++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        System.out.println("Enter the size of position array");
        int n=sc.nextInt();
        int position[]=new int[n];
        System.out.println("Enter the position array:");
        for(int i=0;i<n;i++){
            position[i]=sc.nextInt();
        }
        int speed[]=new int[n];
        System.out.println("Enter the speed array:");
        for(int i=0;i<n;i++){
          speed[i]=sc.nextInt();  
        }
        int result = carFleet(target,position,speed);
        System.out.println(result);
        sc.close();
    }
}
