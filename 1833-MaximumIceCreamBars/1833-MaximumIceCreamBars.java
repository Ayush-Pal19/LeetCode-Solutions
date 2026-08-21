// Last updated: 7/31/2026, 8:27:57 PM
class Solution {
    public void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
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
    public void sort(int[] arr, int l, int r) {
        if (l>=r) return;
        int mid = l + (r - l) / 2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        sort(costs, 0, n-1);
        // for (int x : costs) {
        //     System.out.print(x + " ");
        // }
        // System.out.println();
        int sol = 0;
        for (int x : costs) {
            // if (x <= coins) {
            //     sol++;
            //     coins-=x;
            // }
            if (x > coins) break;
            sol++;
            coins -= x;
        }
        return sol;
    }
}