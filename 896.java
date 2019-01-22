class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length <= 2) return true;
		boolean flag = true;
		int j = 0;
		for (int i = 0; i < A.length - 1; i++) {
			j = i;
			if(A[i + 1] == A[i]) continue;
			else if(A[i + 1] > A[i]) {
				flag = true;
				break;
			}
			else {
				flag = false;
				break;
			}
		}
		for (int i = j + 1; i < A.length - 1; i++) {
			if(flag) {
				if(A[i + 1] < A[i]) return false;
			}
			else {
				if(A[i + 1] > A[i]) return false;
			}
		}
		return true;
    }
}
