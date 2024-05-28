package spoj;

import java.util.Scanner;

class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        long money = scn.nextLong();

        long[] amount = new long[] {0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000};
        double [] discount = new double[] {1, 0.97, 0.95, 0.93, 0.9, 0.88, 0.85};

        long payment = 0;

        for(int i=amount.length-1 ; i>=0; i--){
            if(money > amount[i]){
                payment = payment + ((long)((money - amount[i]) * discount[i]));
                money = amount[i];
            }
        }

        System.out.println(payment);
        scn.close();
    }
}
