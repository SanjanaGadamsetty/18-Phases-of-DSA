class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_val = 0;
        for (int i = 0; i < accounts.length; i++){
            int curr_sum = 0;
            for (int j : accounts[i]) curr_sum += j;
            max_val = Math.max(max_val, curr_sum);
        }
        return max_val;
    }
}
