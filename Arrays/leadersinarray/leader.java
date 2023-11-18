package Arrays.leadersinarray;

public class leader {
    public static void printLeader(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
                if(j==n){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {16,17,4,3,5,2};
        int n=arr.length;
        printLeader(arr,n);
    }
    
}
