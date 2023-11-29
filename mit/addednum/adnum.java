package mit.addednum;
import java.util.Arrays;
public class adnum {
    public static int findAddedValue(int n,int[] A,int[] G){
        Arrays.sort(A);
        Arrays.sort(G);

        int addedValue = 0;

        for (int i = 0; i < n - 1; i++) {
            if (A[i] != G[i]) {
                addedValue = G[i] - A[i];
                break;
            }
        }

        return addedValue;

        
    }
    public static void main(String args[]){
        int n=4;
        int[] A={4,3,1,2};
        int[] G={7,4};

        int addedValue=findAddedValue(n,A,G);
        System.out.println(addedValue);
    }
}
