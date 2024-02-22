package Neetcode.Stack.minstack;
import java.util.*;
public class min {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        sc.close();
    } 
}


// class MinStack {
//     int min = Integer.MAX_VALUE;
//     Stack<Integer> stack = new Stack<Integer>();
//     public void push(int x) {
//         if(x <= min){          
//             stack.push(min);
//             min=x;
//         }
//         stack.push(x);
//     }

//     public void pop() {
//         if(stack.pop() == min) min=stack.pop();
//     }

//     public int top() {
//         return stack.peek();
//     }

//     public int getMin() {
//         return min;
//     }
// }