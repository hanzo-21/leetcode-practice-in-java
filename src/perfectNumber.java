public class perfectNumber {
    public static String checkPerfectNumber(int num) {
        int sum=0;

        for (int i = 1; i<= num/2  ; i++){
            if(num%i ==0 ){
                sum+=i;
            }
        }
        return (sum==num?"It's a perfect number":"It's not a perfect number");
    }
}
