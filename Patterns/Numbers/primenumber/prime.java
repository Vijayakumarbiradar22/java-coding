package Patterns.Numbers.primenumber;

public class prime {
    public static int Prime(int num){
        if(num<2){
            return 0;
        }
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        int rows=4;
        int num=2;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.println(Prime(num));
                num++;
                System.out.println(num);
            }
            System.out.println();
        }
    }
    
}
