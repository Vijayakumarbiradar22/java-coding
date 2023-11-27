package mit.agusticvalues;
import java.util.Scanner;
public class agustic {
    public static String findSumOfAgusticValues(String s){
        long result=calculateAgusticValue(s,1,s.charAt(0)-'0',0);
        return Long.toString(result);
    }

    public static long calculateAgusticValue(String s,int index,long current,long currentSum){
        if(index==s.length()){
            return currentSum+current;
        }
        long result=calculateAgusticValue(s,index+1,current*10+(s.charAt(index)-'0'),currentSum);
        result+=calculateAgusticValue(s,index+1,s.charAt(index)-'0',currentSum+current);
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String str=sc.nextLine();
        String result=findSumOfAgusticValues(str);
        System.out.println(result);
        sc.close();
    }
    

}
