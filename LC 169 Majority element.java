class Solution {
    public int majorityElement(int[] nums) {
        int max_ele = 0, cnt = 0;
        for (int n : nums){
            if (cnt == 0) max_ele = n;
            if (n == max_ele) cnt++;
            else cnt--;
        }
        return max_ele;
    }
}
