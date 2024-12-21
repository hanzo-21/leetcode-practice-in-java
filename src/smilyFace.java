public class smilyFace {
    public static String replaceSmiley(String text) {
        String sub1,sub2,sub3, newString="";

        int amth = Math.sqrt()

        for(int i =0; i < text.length();i++){
            sub1 = text.substring(i,i+1);
            if(sub1.compareTo(":") ==0){
                sub2 = text.substring(i+1 , i+2);
                if(sub2.compareTo(")") ==0 ){
                    //this is simly
                    sub1= "\uD83D\uDE0A";
                    newString = newString.concat(sub1);
                    break;
                }
            }
            newString = newString.concat(sub1);
        }
        return newString;
    }
}
