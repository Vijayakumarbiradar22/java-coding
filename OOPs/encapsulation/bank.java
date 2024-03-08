package OOPs.encapsulation;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password=pass;
    }
}

public class bank {
    public static void main(String args[]){
       Account account1 = new Account();
       account1.name="Vijay Bank";
       account1.email="vijaybank22@gmail.com";
       account1.setPassword("vijay22");
       System.out.println(account1.getPassword()); 
    }
    
}
