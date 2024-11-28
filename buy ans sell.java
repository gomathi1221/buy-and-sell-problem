class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int a=prices[0];
        int max=0;
        int  profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>a){
                profit=prices[i]-a;
                max=Math.max(profit,max);
            }
            else{
                a=prices[i];
            }
        }
        return max;
    }
}