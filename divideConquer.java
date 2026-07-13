public class divideConquer {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid){
        int temp[]= new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=ei) {
            if (arr[i] < arr[j]) {
                temp[k]=arr[i];
                i++;
            }else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }

        for(k=0, i=si; k<temp.length;k++,i++){
            arr[i]= temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for (int j = si; j < ei; j++) {
            if (arr[j]<=pivot) {
                //swap
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        
        return i;
    }

    public static int searchRotated(int arr[], int si, int ei, int target){
        if (si>ei) {
            return -1;
        }
        int mid = si + (ei-si)/2;
        if (arr[mid]==target) {
            return mid;
        }

        //L1
        if (arr[si]<=arr[mid]) {
            //case a:
            if (arr[si] <= target && target<=arr[mid]) {
                return searchRotated(arr, si, mid-1, target);
            }
            // case b:
            else{
                return searchRotated(arr, mid+1, ei, target);
            }
        }
        //L2
        else{
            //case c:
            if (arr[mid]<=target && target<=arr[ei]) {
                return searchRotated(arr, mid+1, ei, target);
            }
            else{
                //case d:
                return searchRotated(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {6, 3, 9, 5, 2, 8, 10,};
        int target = 10;
        // int tarIdx = searchRotated(arr, 0, arr.length-1, target);
        // System.out.println(tarIdx);
        System.out.println(searchRotated(arr, 0, arr.length-1, target));
    }
}
class Solution {
    public static int search(int[] nums, int target, int si, int ei) {
        int mid = si+(ei-si)/2;
        if(si>ei){
            return -1;
        }

        if(nums[mid]==target){
            return mid;
        }
        //L1
        if(nums[si]<=nums[mid]){
            //case a:
            if(nums[si]<=target && target<=nums[mid]){
                return search(nums, target, si, mid-1);
            }
            else{
                return search(nums, target, mid+1, ei);
            }
        }
        //L2
        else{
            //case c:
            if(nums[mid]<=target && target<=nums[ei]){
                return search(nums, target, mid+1, ei);
            } else{
                return search(nums, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args){
        int nums[] = {6, 3, 9, 5, 2, 8, 10,};
        int target = 10;
        System.out.println(search(nums, target, 0, nums.length-1));
    }
}