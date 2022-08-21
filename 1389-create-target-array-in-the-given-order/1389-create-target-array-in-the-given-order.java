class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for(int k = 0; k < res.length; k++)
            res[k] = -1;
        int add = 0;
        for(int n : nums) {
            if(res[index[add]] != -1) {
                for(int i = add; i > index[add]; i--) {
                    res[i] = res[i-1];
                }
            }
            res[index[add]] = n;
            add++;
        }
        return res;
    }
}