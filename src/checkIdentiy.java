public class checkIdentiy {
    public static String checkIdenticalItems(int[] arr) {
        for(int i =0 ; i< arr.length -1 ; i++){
            if(arr[i] != arr[i+1]){
                return "Not all items are identical";
            }
        }
        return "All items are identical";



    }
}
