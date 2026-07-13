public class practice {    

    public static int trappingRainwater(int arr[]){
        int n = arr.length;
        int ltmax[]= new int[arr.length];
        ltmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            ltmax[i] = Math.max(arr[i], ltmax[i-1]);
        }
        int rtmax[] = new int[n];
        rtmax[arr.length-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rtmax[i] = Math.max(arr[i], rtmax[i+1]);
        }
        int waterlevel;
        int trappedwater = 0;
        for (int i = 0; i < arr.length; i++) {
            waterlevel = Math.min(ltmax[i], rtmax[i]);
            trappedwater += waterlevel - arr[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainwater(arr));
    }
}
