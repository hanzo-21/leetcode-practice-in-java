public class hideVowels {
    public static String replaceVowels(String str, char ch) {
        String sub1, newString="";
        String character = String.valueOf(ch);
        String vowels = "aeiouAEIOU";
        for(int i =0 ; i<str.length();i++){
            sub1= str.substring(i,i+1);
            if(vowels.contains(sub1)){
                sub1 = character;
            }
            newString = newString.concat(sub1);
        }
        return  newString;

    }
}
