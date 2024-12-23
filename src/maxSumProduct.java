public class maxSumProduct {
    public static int calculateMaxValue(String str) {
        int sum = 0 , mul = 1;
        String sub;

        for(int i =0 ; i < str.length() ;i ++){
            sub = str.substring(i,i+1);
            sum = sum+  Integer.parseInt(sub);
            mul = mul * Integer.parseInt(sub);
            System.out.println(sum +","+mul);
        }

        return (Math.max(sum, mul));
    }
}
