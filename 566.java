class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
       if((nums.length * nums[0].length) != (r*c)) return nums;
		else {
			int[][] res = new int[r][c];
			int x = 0;
			int y = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if(y <= nums[0].length - 1) {
						res[i][j] = nums[x][y];
						y++;
						continue;
					}
					else {
						x++;
						y = 0;
						res[i][j] = nums[x][y];
                        y++;
					}
				}
			}
			return res;
		}
    }
}
