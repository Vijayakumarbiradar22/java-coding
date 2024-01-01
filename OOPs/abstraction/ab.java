package OOPs.abstraction;

 abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("Animal eats");
    }
 }

 class Horse extends Animal {
    public void walk(){
        System.out.println("Walks on 4 leg.");
    }
 }

 class Hen extends Animal{
    public void walk(){
        System.out.println("Walks on 2 leg.");
    }
 }

public class ab {
    public static void main(String args[]){
        

    }
    
}
