package arrays;

//      You are given an array of integers 'prices' of size 'n',
//      where 'prices[i]' is the price of a given stock on an 'i'-th day.
//      You want to maximize the profit by choosing a single day to buy one stock
//      and a different day to sell that stock.
//      Please note that you can't sell a stock before you buy one.
//      Return the maximum profit you can achieve from this transaction.

public class BestTimeBuyAndSellStock {

    public static int bestTimeToBuyAndSellStock(int []prices) {
        int profit = 0;
        int maxprofit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > buy){
                profit = prices[i]-buy;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buy = prices[i];
            }
        }
        return maxprofit;
    }
}
