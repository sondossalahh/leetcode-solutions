class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0,cuurentCustomerWealth;
        for(int[]customer: accounts){
            cuurentCustomerWealth=0;
            for(int bank : customer){
                cuurentCustomerWealth+=bank;
            }
            maxWealth=Math.max(cuurentCustomerWealth,maxWealth);
        }
        return maxWealth;
    }
}