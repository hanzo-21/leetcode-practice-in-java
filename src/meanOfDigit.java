public class meanOfDigit {
    public static double calculateMean(int num) {
        double sumMean =0 , count = 0;
        while (num !=0){
            sumMean = sumMean + (num%10);
            num = num /10;
            count++;
        }

        return sumMean / count;

    }
}
