public class concatArray {
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] finalArray = new int[(arr1.length+arr2.length)];
        int index=0;
        for (int num : arr1){
            finalArray[index] = num;
            index++;
        }
        for (int num : arr2){
            finalArray[index] = num;
            index++;
        }
        return finalArray;
    }
}
