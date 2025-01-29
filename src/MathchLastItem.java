import java.util.Objects;

public class MathchLastItem {
    public static String matchLastItem(String[] arr, int arrSize) {
        String contString="";

        for (int i = 0 ; i< arr.length -1 ; i++){
              contString=contString.concat(arr[i]);
        }

        return (Objects.equals(contString, arr[arr.length - 1]) ? "Match":"No match");

    }
}
