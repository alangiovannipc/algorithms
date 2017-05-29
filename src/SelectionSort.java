/**
 * Created by AlanPolar on 29/05/2017.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] myarray = {45,21,16,2,34,15};
        selection_sort(myarray,myarray.length);

        for(int num:myarray){
            System.out.println(num);
        }
    }

    public static void selection_sort(int[] arr, int n){
        int i,j,min,temp;

        for (i=0;i<n-1;i++) {

            min = i;

            for(j=i+1;j<n;j++){

                if (arr[j] <= arr[min]) {
                    min = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
