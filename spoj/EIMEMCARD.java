package spoj;

import java.util.Scanner;

class EIMEMCARD {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int numItems = scn.nextInt();
        
        double totalPurchase = 0;

        long[] levels = {0, 1000000, 20000000, 50000000, 200000000};
        double[] discount = {0, 0.02, 0.03, 0.05, 0.07};

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<numItems; i++){

            double moneyInput = scn.nextDouble();

            int j = 0;

            for(j = levels.length - 1; j>=0 ; j--){
                if(totalPurchase >= levels[j]){

                    totalPurchase += moneyInput * (1 - discount[j]);
                    break;
                }
            }

            sb.append((long)Math.round(moneyInput * discount[j]) + " ");

        }

        System.out.println(sb);
    }    
}
