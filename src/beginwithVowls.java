import javax.print.DocFlavor;

public class beginwithVowls {
    public static String checkVowelStart(String word) {
        String firstString =  String.valueOf(word.charAt(0));
        String vowels = "aeiouAEIOU";
        return (vowels.contains(firstString)?"Starts with a vowel":"Doesn't Starts with a vowel");
    }
}
