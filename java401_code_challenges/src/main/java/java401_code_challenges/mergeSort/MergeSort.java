package java401_code_challenges.mergeSort;


public class MergeSort {

    public static void MergeSort(int[] arr){
        int n = arr.length;
        if(n<2){
            return;
        }
        int mid = n/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[n-mid];

        for (int i = 0; i < mid; i++){
            leftHalf[i] = arr[i];
        }

        for (int j = mid; j<n; j++){
            rightHalf[j-mid] = arr[j];
        }

        MergeSort(leftHalf);

        MergeSort(rightHalf);

        Merge(leftHalf, rightHalf, arr);
    }

    public static void Merge(int[] b, int[] c, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < b.length && j < c.length){
            if(b[i] <= c[j]){
                arr[k++] = b[i++];
            }
            else{
                arr[k++] = c[j++];
            }
        }

        while (i<b.length){
            arr[k++] = b[i++];
        }

        while (j<c.length){
            arr[k++] = c[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {-5, -4, -1, -10, -20};
        MergeSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
