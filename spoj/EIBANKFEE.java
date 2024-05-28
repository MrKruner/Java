package spoj;

import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int money = scn.nextInt();
        int numOfSec = scn.nextInt();

        int[] listMoney = {0, 500, 2000, 5000};
        double[] monthlyFee = {12, 7.5, 5, 0};
        double[] secCost = {0.2, 0.2, 0.1, 0};

        double payment = 0;

        for(int i=listMoney.length-1; i>=0; i--){
            if(money >= listMoney[i]){
                payment = numOfSec * secCost[i] + monthlyFee[i];
                break;
            }
        }

        System.out.println((long)payment);

        scn.close();
    }
}
