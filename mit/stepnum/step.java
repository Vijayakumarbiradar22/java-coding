package mit.stepnum;
import java.util.Queue;
import java.util.LinkedList;
public class step {
    public static void displayStepNumber(int n,int m){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 9; i++) { 
            queue.add(i); 
        } 
        while (!queue.isEmpty()) { 
            int stepNum = queue.poll(); 
            if (stepNum >= n && stepNum <= m) { 
                System.out.print(stepNum + " "); 
            } 
            if (stepNum == 0 || stepNum > m) {
            continue;
        }
        
        int lastDigit = stepNum % 10;
        int stepNumA = stepNum * 10 + (lastDigit - 1);
        int stepNumB = stepNum * 10 + (lastDigit + 1);
        if (lastDigit == 0) {
            queue.add(stepNumB);
        } else if (lastDigit == 9) {
            queue.add(stepNumA);
        } else {
            queue.add(stepNumA);
            queue.add(stepNumB);
        }
    }

    }
    public static void main(String args[]){
        int n=0;
        int m=100;
        displayStepNumber(n,m);
    }
    
}
