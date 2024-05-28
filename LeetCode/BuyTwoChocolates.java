import java.util.Arrays;

class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int temp = money;
        money -= (prices[0] + prices[1]);
        
        if(money < 0){
            return temp;
        }else{
            return money;
        }
    }
}
