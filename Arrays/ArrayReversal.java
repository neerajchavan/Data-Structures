public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,30,50};
        int[] temp = new int[arr.length];

        for(int i=arr.length-1, j=0; i>=0 && j<arr.length; i--, j++){
            temp[j] = arr[i];
        }

        for(int num : temp){
            System.out.println(num+" : ");
        }
    }
}