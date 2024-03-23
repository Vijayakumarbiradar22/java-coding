package Recursion.removedup;

public class dup {
    public static boolean map[]=new boolean[26];
    public static void removeDup(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(indx);
        if(map[currChar-'a']==true){
            removeDup(str, indx+1, newString);
        } else {
            newString +=currChar;
            map[currChar-'a']=true;
            removeDup(str, indx+1, newString);
        }
    }
    public static void main(String args[]){
        String str="vijjayy";
        removeDup(str, 0, "");
    }
}
