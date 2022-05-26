class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int total = 0;
        int maxvalue = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            left[i] =  Math.max(height[i], maxvalue);
            maxvalue = left[i];
        }
        maxvalue = Integer.MIN_VALUE;
        for(int i = n - 1; i >=0; i--) {
            right[i] = Math.max(height[i], maxvalue);
            maxvalue = right[i];
        }
        for(int i = 0; i<n; i++) {
            total +=  Math.min(left[i], right[i]) - height[i];
        }
        return total;
    }
}