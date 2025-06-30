public class arraysumofelements {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,0};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of array is: "+sum);
    }
}