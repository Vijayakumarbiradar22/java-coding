package Arrays.betweenrange;

public class nums {
    public static void main(String args[]){
        int arr[]= {1,12,14,20,25,37,65,72};
        int start=2;
        int end=40;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=start && arr[i]<=end){
                count+=1;
                System.out.print(arr[i]+" ");
            }
        }

        if(count>0){
            System.out.println(count+" numbers available");
        } else {
            System.out.println("No numbers available");
        }
    }
    
}
