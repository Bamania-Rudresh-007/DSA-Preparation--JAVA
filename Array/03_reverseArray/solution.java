public class solution {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int start = 0;
        int end = arr.length-1;

        System.out.print("Original Array:- ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("\nReversed Array:- ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
