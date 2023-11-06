package Numbers.sumfl;

public class sum {
    public static void main(String args[]){
        int num=1234;
        int rem,first=0;
        int last = num%10;
        while(num>0){
            rem=num%10;
            first=rem;
            num=num/10;
        }

        System.out.println(first+last);
    }
    
}
