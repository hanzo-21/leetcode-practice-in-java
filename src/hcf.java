public class hcf {
    public static int hcf(int num1, int num2) {
        int highFC = (num1 <num2 ? num1 :num2);

        while (true){
            if(num1 % highFC ==0 && num2 % highFC ==0){
                return highFC;
            }
            highFC++;
        }
    }
}
