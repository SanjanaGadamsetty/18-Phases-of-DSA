class Solution {
    public int[] replaceElements(int[] arr) {
        int max_val = 0, n = arr.length;
        int[] ans = new int[n];
        for (int i = n-1; i >= 0; i--){
            if (max_val == 0) ans[i] = -1;
            else ans[i] = max_val;
            max_val = Math.max(max_val, arr[i]);
        }

        return ans;
    }
}
