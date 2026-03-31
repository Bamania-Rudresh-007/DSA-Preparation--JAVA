public class solution {
    public static void main(String args[]){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = 0;
        int currentSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }

        System.out.println("Max sum is: " + maxSum);
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
