class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++){
            String s = operations[i];
            if (s.charAt(0) == '+') ++x;
            else if (s.charAt(0) == '-') --x;
            else if (s.charAt(2) == '+') x++;
            else x--;
        }
        return x;
    }
}
