package spoj;

import java.util.Scanner;

class EIBANKRATE {
    public static void main(String[] args) {

        // Truong hop co lai kep

        // Scanner scn = new Scanner(System.in);

        // int money = scn.nextInt();
        // int months = scn.nextInt();

        // int year = months/12;
        // double interestMonth = (double)3/400 * (months % 12);

        // double result = (money * Math.pow((1 + 0.09), year)) * (1 + interestMonth);

        // System.out.println(result);

        Scanner scn = new Scanner(System.in);

        long money = scn.nextLong();
        int months = scn.nextInt();

        double result = money * (1 + (double)9/100/12 * months);

        System.out.println(result);

        scn.close();
    }
}