package Arrays;
public class Stocks {

    public static int sales(int p[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<p.length; i++){
            if(p[i]>buyPrice){
                int profit = p[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = p[i];
            }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.print(sales(prices));
    }
}
