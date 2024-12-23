public class hcf {
    public static int hcf(int num1, int num2) {
        int highFC = (Math.max(num1, num2));

        while (true){
            if( highFC % num1  ==0 &&  highFC % num2==0){
                return highFC;
            }
            highFC--;
        }
    }
}
