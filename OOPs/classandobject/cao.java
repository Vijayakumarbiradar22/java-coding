package OOPs.classandobject;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class cao {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";

        

    }
    
}
