package spoj;

import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numTestCase = scn.nextInt();

        for(int i=0; i<numTestCase; i++){
            double amountMoney = scn.nextDouble();
            double interestRate = scn.nextDouble();
            double target = scn.nextDouble();

            double year = Math.log(target/amountMoney) / Math.log(1 + interestRate/100);

            System.out.println((int)Math.ceil(year));
        }

        scn.close();
    }
}
