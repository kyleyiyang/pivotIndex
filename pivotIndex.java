class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length==0) return -1;
        else {
            int sum_l = 0;
            int sum_r = 0;
            for (int i=0;i<nums.length;i++) {
                sum_r+=nums[i];
            }
            if (sum_l==(sum_r-=nums[0])) return 0;
            for (int i=1;i<nums.length;i++) {
                if ((sum_l+=nums[i-1])==(sum_r-=nums[i])) return i;
            }
            return -1;
        }
    }
}
