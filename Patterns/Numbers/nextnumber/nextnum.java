package Patterns.Numbers.nextnumber;

public class nextnum {
    public static void main(String args[]){
        int n=4,num=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               System.out.print(num+" ");
               num++; 
            }
            System.out.println();
        }
    }
    
}
