class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        for (int p2 = 0; p2 < nums.length; p2++){
            if (nums[p2] != 0){
                int temp = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = temp;
                p1++;
            }
        }
        return;
    }
}
