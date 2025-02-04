import java.util.List;

public class PraticeJava {
    public static int hcf(int num1, int num2) {
        int numberHCF = Math.max(num1, num2);

        while (true) {

            if (num1 % numberHCF == 0 && num2 % numberHCF == 0){
                return numberHCF;
            }
            numberHCF--;
        }
    }
}
