class Solution {
    public int balancedStringSplit(String s) {
        int ctr = 0, res =0;
        for(int i = 0; i < s.length(); i++) {
            ctr += s.charAt(i) == 'L' ? 1 : -1;
            if(ctr == 0)
                res++;
        }
        return res;
    }
}