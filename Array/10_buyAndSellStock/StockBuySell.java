public class StockBuySell{
    public static void main(String args[]){
        int[] arr = {7,1,5,3,6,4};
        int minValue = arr[0];
        int profit = 0;
        int maxProfit = 0;


        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
            profit = arr[i] - minValue;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        System.out.println(maxProfit);  
    }
}