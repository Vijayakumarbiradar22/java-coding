package Patterns.Alpha.triangle;

public class at {
    public static void main(String args[]){
       char chr='E';
       
       for(char i='A';i<=chr;i++){
        for(char j='A';j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }

       for(char i=chr;i>='A';i--){
        for(char j='A';j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
    
}
