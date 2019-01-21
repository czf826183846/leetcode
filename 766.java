class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
			int tmp = matrix[0][i];
			int b = i;
			int a = 0;
			while((a <= matrix.length - 1)&&(b <= matrix[0].length - 1)) {
				if(matrix[a][b] != tmp) return false;
				else {
					a++;
					b++;
				}
			}
		}
		for (int i = 1; i < matrix.length - 1; i++) {
			int tmp = matrix[i][0];
			int b = 0;
			int a = i;
			while((a <= matrix.length - 1)&&(b <= matrix[0].length - 1)) {
				if(matrix[a][b] != tmp) return false;
				else {
					a++;
					b++;
				}
			}
		}
		return true;
    }
}
