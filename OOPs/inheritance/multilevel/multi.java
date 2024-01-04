package OOPs.inheritance.multilevel;

class Shape{
    public void area(){
      System.out.println("Display area");  
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Area="+1/2*l*h);
    }
}

class Equilateral extends Triangle{
    
}

public class multi {
    
}
