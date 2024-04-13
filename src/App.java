

public class App {
    public static void main(String[] args) throws Exception {
        double x = 3.14;
        double y = -10;

        double maxValue = Math.max(x, y);
        double minValue = Math.min(x, y);
        double absValue = Math.abs(y);
        double sqrtValue = Math.sqrt(maxValue);
        double roundValue = Math.round(sqrtValue);
        double ceilValue = Math.ceil(sqrtValue); //rounds up
        double floorValue = Math.floor(sqrtValue); //rounds down


        System.out.println("Max double value is:  " + maxValue);
        System.out.println("Min double value is:  " + minValue);
        System.out.println("Absolute value of y is:  " + absValue);
        System.out.println("Square root of max value is:  " + sqrtValue);
        System.out.println("Round of sqrtValue is:  " + roundValue);
        System.out.println("ceil of sqrtValue: " + ceilValue);
        System.out.println("floor of sqrtValue: " + floorValue);






    }
}
