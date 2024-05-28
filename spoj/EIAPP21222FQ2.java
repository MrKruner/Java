package spoj;
import java.util.Scanner;

class EIAPP21222FQ2 {
    static double[] interestRates = { 0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int months = scn.nextInt();


        double outputMoney = 0;

        for (int i = 0; i < months; i++) {
            double moneyInput = scn.nextDouble();

            outputMoney += totalPerMoney(months-i, moneyInput);
        }

        System.out.println(Math.round(outputMoney));

        scn.close();
    }

    static double totalPerMoney(int months, double moneyInput){
        return moneyInput * Math.pow((1 + interestRates[12]/100), months/12) * (1 + (interestRates[months%12]/100 /12) * (months%12));
    }
}
