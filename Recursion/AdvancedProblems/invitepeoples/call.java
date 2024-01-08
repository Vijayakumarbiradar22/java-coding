package Recursion.AdvancedProblems.invitepeoples;

public class call {
    public static int callGuest(int n){
        // if there is only one person
        if(n<=1){
            return 1;
        }
        
    }
    public static void main(String args[]){
        int n=4;
        int totaldays = callGuest(n);
        System.out.println(totaldays);
    }
    
}
