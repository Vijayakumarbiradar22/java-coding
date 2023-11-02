package Recursion.findpower;

public class power {
    public static int findPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int powm1 = findPower(x,n-1);
        int pow = n*powm1;
        return pow;
    }
    public static void main(String args){
        int x=2;
        int n=5;
        int result = findPower(x,n);

        System.out.println(result);
    }
    
}
