/**
 * Created by AlanPolar on 26/05/2017.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] myarray = {12,67,45,21,16,2,34,15};
        merge_sort(myarray,0, myarray.length-1);

        for(int num:myarray){
            System.out.println(num);
        }
    }

    public static void merge_sort(int[] arr, int p, int r) {
        if (p<r) {
            int q = (p+r) / 2;
            merge_sort(arr,p,q);
            merge_sort(arr,q+1,r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int i, j, k;
        int n1 = q - p + 1;
        int n2 = r - q;

        //we create two arrays for the left side and the right side
        int[] left_arr = new int[n1+1];
        int[] right_arr = new int[n2+1];

        //Fill the two arrays
        for(i=0;i<n1;i++){
            left_arr[i] = arr[p+i];
        }

        for(j=0;j<n2;j++){
            right_arr[j] = arr[q+j+1];
        }

        //We put an extra value called sentinel
        left_arr[n1] =  Integer.MAX_VALUE;
        right_arr[n2] =  Integer.MAX_VALUE;

        i = 0;
        j = 0;

        for(k = p;k<=r;k++){
            if (left_arr[i] <= right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
            } else {
                arr[k] = right_arr[j];
                j++;
            }
        }
    }
}
