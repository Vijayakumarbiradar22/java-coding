package Strings.compare;

public class com {
    public static void main(String args[]){
        String name1="vijay";
        String name2="vijay";

        //do not use "==" for compare some code like following gives wrong result
         //if(new String("vijay")==new String("vijay")){

        if(name1.equals(name2)){
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
    
}
