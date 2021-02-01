class RemoveElement {
    // Copy paste Solution3 class in leetcode compiler
    // Change name of Solution3 to Solution while running code in leetcode compiler
}

class Solution3 {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int elem : nums) {
            if (elem != val) {
                nums[i] = elem;
                i++;
            }
        }
        return i;
    }
}
