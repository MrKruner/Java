package spoj;

import java.util.Scanner;

public class EIPURCHASE {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        double originalPrice = scn.nextDouble();
        int months = scn.nextInt();
        double prePayMoney = scn.nextDouble();
        double monthlyPay = scn.nextDouble();


        double low = 0, high = 1;

        while (high - low >= 0.000000001d) {

            double debt = originalPrice - prePayMoney;

            double mid = (high + low) / 2;

            // 
            for(int i=0; i<months; i++){
                debt = debt * (1 + mid) - monthlyPay;
            }

            if(debt > 0){
                high = mid;
            }else{
                low = mid;
            }
        }

        System.out.printf("%.6f", low);

        scn.close();
    }
}
