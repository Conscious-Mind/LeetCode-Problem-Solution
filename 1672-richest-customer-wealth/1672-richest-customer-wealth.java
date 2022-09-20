class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i < accounts.length; i++) {
            int min = 0;
            for(int j=0; j < accounts[0].length; j++) {
                min += accounts[i][j];
            }
            if(min > max)
                max = min;
        }
        return max;
    }
}