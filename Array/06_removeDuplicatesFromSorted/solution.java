public class solution {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6};

        int j = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
