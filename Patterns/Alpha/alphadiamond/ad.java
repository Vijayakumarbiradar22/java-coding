package Patterns.Alpha.alphadiamond;

public class ad {
    public static void main(String args[]){
        char ch='E';
        for(char i='A';i<=ch;i++){
            for(int s=1;s<=ch-i;s++){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            } 
            System.out.println();
        }

        for(char i=ch;i>='A';i--){
            for(int s=1;s<=ch-i;s++){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
