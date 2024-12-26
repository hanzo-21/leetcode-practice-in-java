public class swappingcasesOfsting {
    public static String swapCase(String str) {
        String sub, newString="";
        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";

        for (int i = 0; i<str.length();i++){
            sub = str.substring(i,i+1);
            if(lowerCase.contains(sub)){
                newString = newString.concat(sub.toUpperCase());
                continue;
            }
            if(upperCase.contains(sub)){
                newString = newString.concat(sub.toLowerCase());
                continue;
            }
            newString = newString.concat(sub);

        }
        return  newString;
    }
}
