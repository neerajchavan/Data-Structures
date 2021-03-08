
public class CyclicArrayRotation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        cyclicRotate(arr);
        
        for(int num : arr){
            System.out.print(num+" : ");
        }
    }

    public static int[] cyclicRotate(int[] arr){
        int lastElem = arr[arr.length-1];

        for(int i=arr.length-1; i>=0; i--){
            if(i == 0)  arr[i] = lastElem;
            else arr[i] = arr[i-1];
        }
        return arr;
    }
}
