import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;


        while (true) {
            boolean a = input.hasNextInt();
            if (a) {

                int abc = input.nextInt();
                sum += abc;
                count++;
            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
}

}
