package spoj;
import java.util.*;

class EIAPP21222FQ1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int moneyInput = scn.nextInt();
        int months = scn.nextInt();

        double[] interestRates = { 6.92, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };

        double outputMoney = 0;

        outputMoney = moneyInput * Math.pow((1 + (interestRates[12] / 100)), months / 12)
                * (1 + ((interestRates[months % 12] / 100) / 12) * (months % 12));

        System.out.println(Math.round(outputMoney));

        scn.close();
    }
}