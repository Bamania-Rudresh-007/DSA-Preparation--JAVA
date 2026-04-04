public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {12,43,54,65,32};
        int firstMax = -1;
        int secondMax = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest element is: " + secondMax);

    }

}
