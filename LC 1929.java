class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] new_arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++){
            new_arr[i] = nums[i];
            new_arr[i + nums.length] = nums[i];
        }
        return new_arr;
    }
}
