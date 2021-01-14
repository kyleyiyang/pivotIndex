class Solution {
    public int pivotIndex(int[] nums) {
        int sum_l = nums[0];
        for (int i=1;i<nums.length-1;i++) {
            if (sum(i,nums)) return i;
        }
        return -1;
    }
    public boolean sum(int i, int[] nums) {
        int sum_l=0;
        int sum_r=0;
        for (int j=0;j<i; j++) {
            sum_l+=nums[j];
        }
        for (int k=i+1;k<nums.length;k++) {
            sum_r+=nums[k];
        }
        if (sum_l==sum_r) return true;
        else return false;
    }
}
