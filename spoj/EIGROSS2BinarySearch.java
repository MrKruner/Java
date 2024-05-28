package spoj;

import java.util.Scanner;

public class EIGROSS2BinarySearch {

    static long[] levels = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
    static double[] rate = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long netIncome = scn.nextLong();

        if(netIncome > 11000000){

            double low = 0, high = Long.MAX_VALUE;

            while (high - low > 0.0001) {
                double mid = (high + low) / 2;
                
                double temp = calculateNet(mid);

                if(temp > netIncome){
                    high = mid;
                }else{
                    low = mid;
                }
            }
           
            System.out.println((long)Math.round(low));

        }else{
            System.out.println(netIncome);
        }

        scn.close();
    }

    public static double calculateNet(double salary){

        double netIncome = 0;

        double taxableIncome = salary - 11000000;

        for(int i=levels.length - 1; i>=0; i--){
            if(taxableIncome > levels[i]){
                netIncome += (double)(taxableIncome - levels[i]) * (1 - rate[i]);
                taxableIncome = levels[i];
            }
        }

        return netIncome + 11000000;
    }

}
