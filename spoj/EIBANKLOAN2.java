package spoj;

import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long loan = scn.nextLong();
        long moneyPaidMonthly = scn.nextLong();
        double interestPerYear = scn.nextDouble();

        double curLoan = loan;
        int numMonth = 0;
        while (curLoan > 0) {
            numMonth++;
            curLoan = curLoan - moneyPaidMonthly + ( curLoan * (interestPerYear/100)/12 );
        }

        System.out.println(numMonth);

        scn.close();
    }
}
