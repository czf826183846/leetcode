class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        HashSet<Integer> list = new HashSet<Integer>();
		int sumA = 0,sumB = 0;
		for(int i : A) {
			sumA += i;
		}
		for(int i : B) {
			list.add(i);
			sumB += i;
		}
		int flap = (sumA - sumB) / 2;
		for(int a : A) {
			if(list.contains(a - flap)) return new int[] {a,a - flap};
		}
		return null;
    }
}
