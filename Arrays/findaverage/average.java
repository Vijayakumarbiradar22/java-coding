package Arrays.findaverage;

public class average {
    public static void main(String args[]){
        double sum=0;
        int arr[] = {1,3,5,7,9};
        int length=arr.length;
        for(int i=0;i<length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Averege is:"+sum/length);
    }
    
}
