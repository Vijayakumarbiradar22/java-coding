package ArrayList.friutavailable;
import java.util.Scanner;
import java.util.ArrayList;
public class check {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits=new ArrayList<>(); 
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");

        System.out.println("Enter the fruit:");
        String fruit=sc.nextLine();

        boolean fruitavailable =false;
        for(int i=0;i<fruits.size();i++){
            if(fruits.get(i).equals(fruit)){
                fruitavailable=true;
            }
        }

        if(fruitavailable){
            System.out.println(fruit+" is available");
        } else {
            System.out.println(fruit+" is not available");
        }
        sc.close();
    }
    
}
