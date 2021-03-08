public class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 70, 40, 60, 30, 1 };
        System.out.println("Min : " + min(arr));
        System.out.println("Max : " + max(arr));
    }

    public static int min(int arr[]) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int max(int arr[]) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
