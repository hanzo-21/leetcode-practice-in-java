public class removeSpecial {
    public static String removeSpecialCharacters(String str) {
        String sub , finalString="" ;
        String approvedLetter= "qwertyuiopasdfghjklzxcvbnm QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        for(int i = 0 ; i <str.length();i++){
            sub = str.substring(i,i+1);
            if(approvedLetter.contains(sub)){
                finalString = finalString.concat(sub);
            }
        }
        return finalString;
    }
}
