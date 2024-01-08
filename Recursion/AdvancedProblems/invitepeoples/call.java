package Recursion.AdvancedProblems.invitepeoples;

public class call {
    public static int callGuest(int n){
        // if there is only one person
        if(n<=1){
            return 1;
        }

        //to call single person
        int ways1 = callGuest(n-1);

        //to call person in pair
        int ways2 = (n-1)*callGuest(n-2);

        return ways1+ways2;
    }
    public static void main(String args[]){
        int n=4;
        int totaldays = callGuest(n);
        System.out.println(totaldays);
    }
    
}
