class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        return func(Arrays.copyOfRange(bits, 0, bits.length - 1));
    }
    
    public boolean func(int[] nums) {
		if(nums.length == 0) return true;
		if((nums.length == 1)&&(nums[0]==1)) return false;
		
		if(nums[0] == 0) return func(Arrays.copyOfRange(nums,1,nums.length));
		else if(nums[0] == 1) return func(Arrays.copyOfRange(nums, 2, nums.length));

		return true;
	}
}
