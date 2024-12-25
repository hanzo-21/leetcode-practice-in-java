public class countTallestCandelNumber {
    public static int countTallestCandles(int[] arr, int arrSize) {
        int largest = arr[0];
        int count = 1;
        for(int i = 1 ; i < arr.length ;i ++){
            if(largest == arr[i]){
                count++;
                continue;
            }
            if(largest < arr[i]){
                largest = arr[i];
                count = 1;
            }
        }
        return count;
    }
}
