package OOPs.staticeg;

class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school="newschool";
    }
}

public class stat {
    public static void main(String args[]){
        Student.school="SMVITM";
        Student student1=new Student();
       student1.name ="Vijay";
    }
    
}
