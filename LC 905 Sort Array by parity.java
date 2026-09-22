class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right){
            if (nums[left] % 2 == 1){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
            else if (nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            else{
                left++;
                right--;
            }
        }
        return nums;
    }
}
