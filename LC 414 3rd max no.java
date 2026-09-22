class Solution {
    public int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE, s = Long.MIN_VALUE, t = Long.MIN_VALUE;
        for (int n : nums){
            if (n == f || n == s || n == t) continue;
            if (f == Long.MIN_VALUE || n > f){
                t = s;
                s = f;
                f = n;
            }
            else if (s == Long.MIN_VALUE || n > s){
                t = s;
                s = n;
            }
            else if (t == Long.MIN_VALUE || n > t) t = n;
        }

        return t == Long.MIN_VALUE ? (int)f : (int)t;
    }
}
