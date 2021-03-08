import java.util.Arrays;

public class KthElement {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 100, 30, 50, 60};
        
        System.out.println(kThMinElement(arr, 3));
        System.out.println(kThMaxElement(arr, 2)); 
    }

    public static int kThMinElement(int[] arr, int k){
        int[] tempArray = arr.clone();
        
        Arrays.sort(tempArray);

        return tempArray[k-1];
    }

    public static int kThMaxElement(int[] arr, int k){
        int[] tempArray = arr.clone();
        
        Arrays.sort(tempArray);

        return tempArray[arr.length - k];
    }
}
