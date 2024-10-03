import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;
        int userInput_int = 0;
        boolean wasInputInteger = false;
        do{
            String userInput = scanner.nextLine();
            wasInputInteger = false;
            try{
                userInput_int = Integer.parseInt(userInput);
                wasInputInteger = true;
                count++;
                sum += userInput_int;
            }catch (Exception e){
                avg = Math.round((double) sum / count);
            }
        }while(wasInputInteger == true);

        System.out.println("SUM = "+sum+" AVG = "+avg);

    }
}