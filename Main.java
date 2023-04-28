import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Mortgage mortCase1 = new Mortgage(
                (int) readNumber("Principal: ", 1000, 1_000_000),
                (float) readNumber("Annual Interest Rate: ", 1, 30),
                (byte) readNumber("Period (Years): ", 1, 30));

        mortCase1.printMortgage();
        mortCase1.printPaymentSchedule();
    }


    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }



}




