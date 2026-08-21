// Last updated: 7/31/2026, 8:28:01 PM
class Solution {
    public void merge (int [] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int [] left = new int[n1];
        int [] right = new int[n2];
        int i,j,k;
        for (i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid+1+j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i<n1 && j<n2) {
            if (left[i]<=right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i<n1) { 
            arr[k++] = left[i++];
        }
        while (j<n2) { 
            arr[k++] = right[j++];
        }
    }
    public void mergesort (int [] arr, int l, int r) {
        if (l>=r) return;
        int mid = (l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        mergesort(arr, 0, arr.length-1);
        arr[0]=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) arr[i] = arr[i - 1] + 1;
        }
        return arr[arr.length-1];
    }
}