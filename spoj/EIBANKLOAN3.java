package spoj;

import java.util.Scanner;

class EIBANKLOAN3 {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        Scanner scn = new Scanner(System.in);
        double debt = scn.nextDouble();
        double actualPay = scn.nextDouble();
        int months = scn.nextInt();
        double rate = scn.nextDouble()/(double)months/100;
        double ratePrepay = scn.nextDouble()/100;

        double monthlyPay = debt / (double)months;

        for(int i=1; i<=months; i++){

            double debtRate = debt * rate;
            double moneyPenalty = (actualPay - monthlyPay) * ratePrepay;

            debt = debt - actualPay + debtRate + moneyPenalty;

            if(debt < 0){
                sb.append(i + " " + 0);
                break;
            }

            sb.append(i + " " + (long)Math.round(debt) + "\n");
        } 

        System.out.println(sb);
    }    
}
