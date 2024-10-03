public class InchesToCentimeters {
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }
}
