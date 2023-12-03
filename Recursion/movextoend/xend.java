package Recursion.movextoend;

public class xend {
    public static void moveallx(String str,int indx,int count,String newString){
        if(indx==str.length()){
            for(int i=0;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
                return;
        }

        char currChar=str.charAt(indx);
        if(currChar=='x'){
            count++;
            moveallx(str, indx+1, count, newString);
        } else {
            newString +=currChar;
            moveallx(str, indx+1, count, newString); 
        }
    }
    public static void main(String args[]){
        String str = "axxbxcxdx";
        moveallx(str, 0, 0, "");

    }
    
}
