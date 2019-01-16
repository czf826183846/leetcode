class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int x = 0; x < A.length; x++) {
			int i = 0;
			int j = A[x].length - 1;
			int tmp = 0;
			while(i <= j) {
				if(i < j) {					
					tmp = A[x][i];
					A[x][i] = convert(A[x][j]);
					A[x][j] = convert(tmp);
					i++;
					j--;
				}
				else {
					A[x][i] = convert(A[x][i]);
                    i++;
					j--;
				}
			}
		}
		return A;
    }
    public int convert(int num) {
		if(num==0) return 1;
		else return 0;
	}
}
