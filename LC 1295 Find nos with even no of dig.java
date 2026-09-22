class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int n : nums){
            int dig = (int) Math.log10(n) + 1;
            if (dig % 2 == 0) cnt++;
        }
        return cnt;
    }
}
