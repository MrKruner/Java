package spoj;

import java.util.Scanner;

class EITAX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long salary = scn.nextLong();
        salary -= 9000000;

        int[] levels = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
        double[] taxes = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};

        double tax = 0;

        for(int i=levels.length-1; i>=0; i--){
            if(salary > levels[i]){
                tax += ((salary - levels[i]) * taxes[i]);
                salary = levels[i];
            }
        }

        System.out.println((long)Math.round(tax));
    }    
}
