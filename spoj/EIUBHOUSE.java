package spoj;

import java.util.Scanner;

class EIUBHOUSE {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double moneyNeed = scn.nextDouble();
        long prePay = scn.nextLong();
        int months = scn.nextInt();
        double interestRate = scn.nextDouble();

        double debt = moneyNeed - prePay;
        double moneyMonthly = debt / months;

        StringBuilder strB = new StringBuilder();

        for (int i = 1; i <= months; i++) {
            double payMonth =  (moneyMonthly + (debt * interestRate / 100));
            debt -= moneyMonthly;
            strB.append(i).append(" ").append((long)Math.round(payMonth)).append("\n");
        }

        System.out.println(strB);

        scn.close();
    }
}
