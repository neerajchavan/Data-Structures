import java.io.IOException;

public class BasicArrayOperations {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int arr[] = {10, 20, 100, 30, 50, 60};

        ArrayOperations ao = new ArrayOperations();
        System.out.println(ao.findMin(arr));

    }

}

class ArrayOperations {

    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int[] reverseArray(int[] arr) {
        int[] reverseArray = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = arr[i];
        }

        return reverseArray;
    }

    public int findMax(int[] arr) {
        if (arr.length != 0) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        } else
            System.out.println("No elements present in array returning 0");

        return 0;
    }

    public int findMin(int[] arr) {
        if (arr.length != 0) {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        } else
            System.out.println("No elements present in array returning 0");

        return 0;
    }
}
