class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> temp = new ArrayList<Integer>();
        int[] res;
        for(int i = 0; i < nums.length; i+=2) {
            for(int j = 0; j < nums[i]; j++) {
                temp.add(nums[i+1]);
            }
        }
        res = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            res[i] = temp.get(i);
        }
        return res;
    }
}