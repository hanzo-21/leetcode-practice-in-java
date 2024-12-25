public class repeteVowlesTwice {
    public static String repeatVowels(String str) {
        String sub, newString="";
        String vowels = "aeiouAEIOU";
        for(int i =0; i< str.length() ;i++){
            sub =str.substring(i,i+1);
            newString = newString.concat(sub);
            if(vowels.contains(sub)){
                newString = newString.concat(sub);
            }
        }
        return newString;
    }

}
