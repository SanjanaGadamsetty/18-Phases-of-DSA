class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l = candies.length;
        List<Boolean> ans = new ArrayList<>(l);
        int max_val = 0;
        for (int i = 0; i < l; i++) max_val = Math.max(max_val, candies[i]);

        for (int i = 0; i < l; i++){
            if (candies[i] + extraCandies >= max_val) ans.add(true);
            else ans.add(false);
        }

        return ans;
    }
}
