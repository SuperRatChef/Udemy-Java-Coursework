public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double decimalPoints = Math.pow(10, 3);

        if((num1 <= 0 && num2 <= 0) || (num1 >= 0 && num2 >= 0)){
            double num1_rounded = (double)((int)(num1 * decimalPoints) / decimalPoints);
            double num2_rounded = (double)((int)(num2 * decimalPoints) / decimalPoints);
            if(num1_rounded == num2_rounded){
                return true;
            }
        }
        return false;
    }
}
