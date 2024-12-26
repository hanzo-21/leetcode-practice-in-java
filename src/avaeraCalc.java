public class avaeraCalc {
    public static double findAverage(double... args) {
        double sum = 0,count = 0;
        for( double num : args){
            sum =sum + num;
            count++;

        }

        return  sum /count;
    }
}
