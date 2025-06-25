public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int val:prices){
            if(val<maxPrice){
                maxPrice=val;
            }
            else{
                int pro=val-maxPrice;
                if(pro>maxProfit){
                    maxProfit=pro;
                }
            }
        }
        return maxProfit;
    }
}
