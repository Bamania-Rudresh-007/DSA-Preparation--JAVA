public class largestElement{
    public static void main(String[] args) {
        int[] arr = {43,2,73,63,24,55};
        int max = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}