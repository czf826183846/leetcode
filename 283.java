class Solution {
    public void moveZeroes(int[] nums) {
        for (int l = 0, r = 0; r < nums.length; ++r) {
            if (nums[r] != 0) {
                if (r != l) {
                    swap(nums, l, r);
                }
                ++l;
            }
        }
    }
    
    private void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
