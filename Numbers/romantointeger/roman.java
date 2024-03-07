package Numbers.romantointeger;
import java.util.Scanner;
public class roman {
    public static int romanToInt(String r){
        int ans=0,num=0;
        for(int i=r.length()-1;i>=0;i--){
            switch(r.charAt(i)){
                case 'I': num=1; break;
                case 'V': num=5; break;
                case 'X': num=10; break;
                case 'L': num=50; break;
                case 'c': num=100; break;
                case 'D': num=500; break;
                case 'M': num=1000; break;
            }
            if(4*num<ans){
                ans-=num;
            } else {
                ans+=num;
            }
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman number:");
        String r = sc.nextLine();
        int result=romanToInt(r);
        System.out.println(result);
        sc.close();
    }
    
}
