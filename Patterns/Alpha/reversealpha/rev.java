package Patterns.Alpha.reversealpha;

public class rev {
    public static void main(String args[]){
        char ch='G';
        for(char i='A';i<=ch;i++){
            for(char j='A';j<=ch;j++){
                System.out.print(j);
            }
            // for(int s=1;s<2*i-2;s++){
            //     System.out.print(" ");
            // }
            for(char k=ch;k>='A';k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
