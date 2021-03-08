import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {10,20,3,4,-9,11};
        int[] arr2 = {14,21,3,6,-9,11};

        int size = doUnion(arr1, arr1.length, arr2, arr2.length);
        System.out.println("Size after union: "+size);

    }

    public static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> set1 = Arrays.stream(a).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(b).boxed().collect(Collectors.toSet());
        set1.addAll(set2);

        return set1.size();
    }

}
