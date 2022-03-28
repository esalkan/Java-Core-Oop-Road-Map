package exercises.tasks.array_tasks;

public class Array_MaximumProfit {

    /*
We are given an array of prices for a given stock. ith  element of this array represents the price of the stock on  day i.
We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.
Write a Java function to find the maximum profit.
    Note that a stock can’t be sold before buying.
    Example:
        Input: [8,3,3,1,4,9,12,11]
        Output: 11

    Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
    Not 8-1 = 7, as the selling price needs to be larger than buying price.
     */

    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 3, 3, 4, 9, 12, 11};

        int min = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i] > min) {
                profit = arr[i] - min;
                if (profit > max) {
                    max = profit;
                }
            }else{
                min = arr[i];
            }
        }
        /*
        int maxProfit = 0;
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] > arr[i])
                temp = i;

            if (arr[i - 1] <= arr[i] )
                if(i + 1 == arr.length || arr[i] > arr[i + 1])
                    maxProfit += (arr[i] - arr[temp]);

        }

         */

        System.out.println("Maximum profit: "+max);

        int buy =0, sell =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] - arr[i] == max){
                    buy = i+1;
                    sell = j+1;
                }
            }
        }

        System.out.println("Buy on day "+buy+" sell on day "+sell);



    }



}
