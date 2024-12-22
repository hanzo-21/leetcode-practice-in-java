public class camelCase {
    public static String convertToCamelCase(String str) {
        String sub1 , newString = "";

        for(int i=0 ;i < str.length();i++ ){
            sub1 = str.substring(i,i+1);
            if(sub1.compareTo(" ") == 0){
                i++;
                sub1 = str.substring(i,i+1);
                sub1 = sub1.toUpperCase();
                newString = newString.concat(sub1);
            }else{
                newString = newString.concat(sub1);
            }
        }
        return newString;
    }
}

