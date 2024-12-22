public class largestInArray {
    public static int findLargestNumber(int[] arr, int arrSize) {
        int max = -999999999;
        for(int i =0 ; i < arrSize ;i ++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return  max;
    }
}
