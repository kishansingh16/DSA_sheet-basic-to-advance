package Lec_14;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0]; //7
        int maxProfit=0;
        for (int i=1;i<n;i++){
            if (prices[i]-min>maxProfit){
                maxProfit=prices[i]-min;
            }
            if(prices[i]<min){
                min=prices[i];
            }

        }
        return  maxProfit;
    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        int prices2[]={7,1,0};
        int prices3[]={7,1,3,5,8,9,6,2};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }
}
