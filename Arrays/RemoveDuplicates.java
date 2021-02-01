public class RemoveDuplicates {
    public static void main(String[] args) {
        // Copy paste Solution4 class in leetcode compiler
        // Change name of Solution4 to Solution while running code in leetcode compiler
    }
}

class Solution4 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j])
                i++;
            nums[i] = nums[j];
        }
        return i + 1;
    }
}
