class Solution {
    public int fib(int N) {
        if(N == 0) return 0;
		if(N == 1) return 1;
		int a = 0,b = 1,c = 1;
		int res = 1;
		for (int i = 2; i < N; i++) {
			c = a + b;
			res = b + c;
			a = b;
			b = c;
			
		}
		return res;
    }
}
