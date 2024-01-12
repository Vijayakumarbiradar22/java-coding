package Patterns.Alpha.righttriangle;

public class ralpha {
    public static void main(String args[]){
        char chr='E';

        
        for(char i='A';i<=chr;i++){
            for(char s='A';s<=chr-i;s++){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
