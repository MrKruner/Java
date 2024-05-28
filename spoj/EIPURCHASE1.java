package spoj;

import java.util.*;

class EIPURCHASE1
{
	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);

        long orignalPrice = scn.nextLong();
        int months = scn.nextInt();
        long payedPrice = scn.nextLong();
        long monthlyPay = scn.nextLong();
        
        long debtPrice = orignalPrice - payedPrice;

        for(double r=0; r<=1; r+=0.001){
            double debt = (double)debtPrice * Math.pow((1 + r), months) - ((double)monthlyPay * (Math.pow((1 + r), months) - 1) / ((1 + r) - 1));

            if(debt >= 0){
                System.out.printf("%.3f", r);
                break;
            }
        }
        scn.close();
    }    
}