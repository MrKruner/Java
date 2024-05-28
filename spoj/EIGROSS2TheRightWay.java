package spoj;

import java.util.Scanner;

class EIGROSS2TheRightWay {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        long NetIncome = scn.nextLong();

        if(NetIncome > 11000000){

            long[] levels = {0, 4750000, 9250000, 16050000, 27250000, 42250000, 61850000, Long.MAX_VALUE};
            double[] rate = {0, 0.05, 0.10, 0.15, 0.20, 0.25, 0.3, 0.35};

            long TaxableIncome = NetIncome - 11000000;
            double GrossIncome = 0.0;
    
            for(int i=1; i<levels.length; i++){ 
                if(TaxableIncome > levels[i]){
                    GrossIncome += (levels[i] - levels[i - 1]) / (1 - rate[i]);
                }else{
                    GrossIncome += (TaxableIncome - levels[i - 1]) / (1 - rate[i]);
                    break;
                }
            }

            System.out.println((long)Math.round(GrossIncome + 11000000));
        }else{
            System.out.println((long)Math.round(NetIncome));
        }

        scn.close();
    }    
}
