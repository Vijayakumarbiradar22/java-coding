package Recursion.subsequence;

public class seq {
    public static void subseq(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(indx);
        //to be
        subseq(str, indx+1, newString+currChar);

        //no to be
        subseq(str, indx+1, newString);
    }
    public static void main(String args[]){
        String str="abc";
        subseq(str, 0, "");

    }
    
}
