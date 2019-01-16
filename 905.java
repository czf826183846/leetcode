public static int[] leetcode905(int[] A) {
		int i = 0,j = A.length - 1;
		int tmp = 0;
		while(i<j) {
			if(A[i]%2 == 1) {
				tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
				j--;
			}
			else {
				i++;
			}
		}
		return A;
	}
