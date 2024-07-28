package Strings.isomorphic;
import java.util.*;
public class iso {
    static int size=256;
    public static String areIsomorphic(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        if(m!=n){
            return "False";
        }
        Boolean[] marked=new Boolean[size];
        Arrays.fill(marked,Boolean.FALSE);

        int map[]=new int[size];
        Arrays.fill(map,-1);

        for(int i=0;i<n;i++){
            if(map[str1.charAt(i)]==-1){
                if(marked[str2.charAt(i)]==true){
                    return "False";
                }
                marked[str2.charAt(i)]=true;
                map[str1.charAt(i)]=str2.charAt(i);
            }
            else if(map[str1.charAt(i)]!=str2.charAt(i)){
                return "False";
            }
        }
        return "True";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1:");
        String str1=sc.nextLine();
        System.out.println("Enter the string 2:");
        String str2=sc.nextLine();
        String result=areIsomorphic(str1,str2);
        System.out.println(result);
        sc.close();
    }
}
