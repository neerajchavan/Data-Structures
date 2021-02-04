public class ValidMountainArray {
    // Copy paste Solution5 class in leetcode compiler
    // Change name of Solution5 to Solution while running code in leetcode compiler
}

class Solution5 {
    public boolean validMountainArray(int[] arr) {
        if (arr == null || !(arr.length >= 3))
            return false;

        boolean increasing = arr[0] < arr[1]; // the mountain must at least start in an increasing manner
        if (!increasing)
            return false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return false; // mountain should be strictly increasing

            if (increasing) {
                if (arr[i] < arr[i - 1])
                    increasing = false; // we reached the peak
            } else {
                if (arr[i] > arr[i - 1])
                    return false; // every element must be decreasing, otherwise return false
            }
        }

        // we can't just return true, we must ensure that a peak was reached at some point.
        return !increasing;
    }
}
