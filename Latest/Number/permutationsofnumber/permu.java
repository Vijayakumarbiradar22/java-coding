package Number.permutationsofnumber;
import java.util.*;
public class permu {
    public static void generatePermutations(String prefix,String str,Set<String> permutations){
        int n=str.length();
        if(n==0){
            permutations.add(prefix);
        } else {
            for(int i=0;i<n;i++){
                generatePermutations(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n), permutations);
            }
        }
    }

    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String input=sc.nextLine();

        Set<String> permutations=new HashSet<>();
        generatePermutations("",input,permutations);
        System.out.println("All permutations are:");
        for(String permu:permutations){
            //System.out.print(permu+" ");
            int num=Integer.parseInt(permu);
            if(isPrime(num)){
                System.out.print(permu+" ");
            }
        }
        sc.close();
    }
    
}
