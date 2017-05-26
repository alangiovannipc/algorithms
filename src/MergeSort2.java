/**
 * Created by AlanPolar on 26/05/2017.
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] myarray = {45,21,16,2,34,15};
        mergeSort(myarray,0, myarray.length-1);

        for(int num:myarray){
            System.out.println(num);
        }
    }

    public static void mergeSort (int[] arr, int p, int r) {
        if (p<r){
            int q = (p+r) / 2;
            mergeSort(arr,p,q);
            mergeSort(arr,q+1,r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int[] list, int lowIndex, int midIndex, int highIndex) {


        int[] L = new int[midIndex - lowIndex + 2];
        for (int i = lowIndex; i <= midIndex; i++) {
            L[i - lowIndex] = list[i];
        }
        L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;

        int[] R = new int[highIndex - midIndex + 1];
        for (int i = midIndex + 1; i <= highIndex; i++) {
            R[i - midIndex - 1] = list[i];
        }
        R[highIndex - midIndex] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = lowIndex; k <= highIndex; k++) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
        }
    }
}
