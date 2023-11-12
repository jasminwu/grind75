package bestTimeToBuySellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = 9876543;
        int answer = 0;

        for (int price : prices) {
            if (price < cheapest) {
                cheapest = price;
            } else {
                answer = Math.max(answer, price - cheapest);
            }
        }
        return answer;
    }
}
