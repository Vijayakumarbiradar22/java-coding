package OOPs.inheritance.singlelevel;

class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Trianglr extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

public class single {
    
}
