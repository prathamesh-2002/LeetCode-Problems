class Solution {
    public int minimumSum(int num) {
        String sNum = Integer.toString(num);
        char[] temp = sNum.toCharArray();
        Arrays.sort(temp);
        String s1 = "" + temp[0] + temp[2];
        String s2 = "" + temp[1] + temp[3];
        return Integer.valueOf(s1) + Integer.valueOf(s2);
    }
}