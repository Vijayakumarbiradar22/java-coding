package Arrays.findaverage;

public class average {
    public static void main(String args[]){
        double sum=0;
        int arr[]={2,4,6,8,10};
        int length=arr.length;

        for(int i=0;i<length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Average is:"+sum/length);
    }
    
}
