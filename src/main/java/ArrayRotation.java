import java.util.Arrays;

//Exercise 1: Rotate an Array
public class ArrayRotation {
    //rotate function
    //takes arr array to rotate, d num of position to rotate, n number of elements in the array
    public static void rotate(int arr[], int d, int n){

        //handle if an array is empty
        if(arr == null || arr.length ==0){
            System.out.println("Array is empty!");
            return;
        }

        //reduce d using % modulo operator
        d = d % n;

        //outer loop to repeat the rotation d times
        for(int j = 0; j < d; j++){
            //save the first element
            int temp = arr[0];

            //inner loop to shift array elements
            for(int i = 0; i < n - 1; i++){
                //shift all element one position to the left
                arr[i] = arr[i+1];
            }

            // place temp in the last position
            arr[n-1] = temp;
        }


    }

    //test rotate
    public static void main(String[] args) {
        //normal rotation
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3;
        int n = 5;
        rotate(arr, d, n);
        System.out.println(Arrays.toString(arr));

        // d > n
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 7;
        int n1 = 5;
        rotate(arr1, d1, n1);
        System.out.println(Arrays.toString(arr1));

        //no rotation
        int[] arr2 = {1, 2, 3, 4, 5};
        int d2 = 0;
        int n2 = 5;
        rotate(arr2, d2, n2);
        System.out.println(Arrays.toString(arr2));

    }
}
