package spoj;

import java.util.Scanner;

public class EIAPP21222FQ3 {

    static double[] interestRates = { 0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        long recieveMoney = scn.nextLong();
        int months = scn.nextInt();

        double depositMoney = (double)recieveMoney / totalRate(months);
        
        System.out.printf("%.4f", depositMoney);
    }

    public static double totalRate(int months){

        double res = 0;

        for(int i = months; i>=1; i--){
            res += Math.pow((1 + interestRates[12]/100), i/12) * (1 + (interestRates[i%12]/100 /12) * (i%12));
        }

        return res;
    }
}
