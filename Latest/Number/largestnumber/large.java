package Number.largestnumber;
import java.util.*;
public class large {
    public static String largestNumber(int nums[]){
        String[] s=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        return s[0].equals("0") ? "0" : String.join("",s);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
            }  
        String result=largestNumber(nums); 
        System.out.println(result);     
        sc.close();
    }
    
}
