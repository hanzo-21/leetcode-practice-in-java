import javax.swing.*;

public class inoders {
    public static String isStringInOrder(String str) {
        for(int i  =1 ; i < str.length() ; i ++){
            if(str.charAt(i-1)>str.charAt(i) ){
                return "String isn't in order";
            }
        }
        return "String is in order";
    }
}

