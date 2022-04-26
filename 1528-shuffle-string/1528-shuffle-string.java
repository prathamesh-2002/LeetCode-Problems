class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        int ctr = 0;
        for(int i : indices) {
            res[i] += s.charAt(ctr);
            ctr++;
        }
        return String.valueOf(res);
    }
}