class Solution {
    public int[] sortArrayByParityII(int[] A) {
       int[] retVal = new int[A.length];
        int[] indices = {0, 1};
        for(int i = 0; i < A.length; i++)
        {
            retVal[indices[A[i]%2]] = A[i];
            indices[A[i]%2] += 2;
        }
        return retVal;
    }
}
