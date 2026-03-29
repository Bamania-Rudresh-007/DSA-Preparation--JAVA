public class solution {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 5;
        int[] rotate = new int[arr.length];
        int temp = k;
        int counter = -1;
        

        for(int i = 0; i < arr.length; i++){
            if(k < arr.length){
                rotate[i] = arr[k];
                counter++;
                k++;
            }
        }

        int m = 0;
        while (m < temp) {
            counter++;
            rotate[counter] = arr[m];
            m++;
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Original array:- ");
        for (int i  = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println("Roatated array:- ");
 
        for(int j = 0; j < rotate.length; j++){
            System.out.print(rotate[j] + " ");
        }

    }
}
