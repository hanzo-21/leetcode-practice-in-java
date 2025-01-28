import java.util.Arrays;

public class stringSorting {
    public static String[] sortStringList(String[] strList) {
       String temp ;
       int shortIndex ;
       for (int  i= 0; i<strList.length -1 ; i++){
           shortIndex = i;
           for (int j =i+1 ; j< strList.length ;j++){
                if(strList[shortIndex].length() > strList[j].length() ){
                    shortIndex = j;
                }
           }
           if(i != shortIndex){
               temp = strList[i];
               strList[i] = strList[shortIndex];
               strList[shortIndex] = temp;
           }
       }
       return strList;
    }
}
