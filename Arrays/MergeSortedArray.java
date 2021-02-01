import java.util.Arrays;

public class MergeSortedArray {
    // Copy paste Solution class in leetcode compiler
    // Change name of solution to Solution while running code in leetcode compiler
}

class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if nums1 is empty merge nums2 directly
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }

        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }

        Arrays.sort(nums1);
    }
}

/*
 * size of nums1 = m + n no of elements in nums1 = m
 * 
 * size of nums2 = n no of elements in nums2 = n
 */