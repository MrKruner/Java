package spoj;

import java.util.Scanner;

class EIBANKFEE2 {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);

        int numAccount = snc.nextInt();

        int[] listMoney = {0, 500, 2000, 5000};
        double[] monthlyFee = {12, 7.5, 5, 0};
        double[] secCost = {0.2, 0.2, 0.1, 0};

        double sum = 0;
        int totalNumSec = 0;

        for(int i=0; i<numAccount; i++){
            long money = snc.nextLong();
            long numOfSec = snc.nextLong();

            totalNumSec += numOfSec;

            for(int j=listMoney.length - 1; j>=0; j--){
                if(money>=listMoney[j]){
                    sum += (numOfSec * secCost[j] + monthlyFee[j]);
                    break;
                }
            }
        }

        System.out.println((sum == 0 || totalNumSec == 0) ? 0 : sum/totalNumSec);
        
        snc.close();
    }
}
