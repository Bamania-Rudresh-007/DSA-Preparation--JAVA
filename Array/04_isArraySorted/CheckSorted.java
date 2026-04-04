public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean flag = false;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.print("Array is not sorted...");
        }
        else{
            System.out.print("Array is sorted");
        }
        
    }    
}
