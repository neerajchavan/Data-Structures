public class ContiguousSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        System.out.println("Maximum Sum of Contiguous Sub Array is : "+ subArraySum(arr));
    }

    public static int subArraySum(int arr[]){
        int maxSum = 0, sum=0;

        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
          if(maxSum < sum)
             maxSum = sum;
          
          if(sum < 0)
             sum=0;
        }
        return maxSum;
    }
}
