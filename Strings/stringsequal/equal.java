package Strings.stringsequal;

public class equal {
    public static boolean arrayStringsEqual(String[] word1,String[] word2){
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();

        for(String word:word1){
            str1.append(word);
        }

        for(String word:word2){
            str2.append(word);
        }

        String s1 = str1.toString();
        String s2 = str2.toString();

        if(s1.equals(s2)){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        String[] word1={"cd","a"};
        String[] word2={"cd","a"};
        arrayStringsEqual(word1,word2);
    }
    
}
