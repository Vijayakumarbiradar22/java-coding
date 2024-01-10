package Strings.replace;

public class rep {
    public static void main(String args[]){
        String str="apple";
        String res="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                res+='i';
            }
            else{
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
    
}
