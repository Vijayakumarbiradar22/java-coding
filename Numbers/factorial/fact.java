package Numbers.factorial;

public class fact {
    public static void findFact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String args[]){
        int n=5;
        findFact(n);
    }
    
}
