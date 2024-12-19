public class palindromnumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int digits = (int) Math.log10(x) + 1;

        while (0 < digits) {
            System.out.println("digits" + digits);
            if (x % 10 != (x / (int) Math.pow(10, digits - 1))) {
                return false;
            }
            // remove the msb
            x = x % (int) Math.pow(10, digits - 1);
            // remove lsb
            x = x / 10;
            // updating digitis
            digits = digits - 2;

        }
        return true;
    }
}

