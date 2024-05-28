package spoj;
import java.util.Scanner;

class EIUCREDIT {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int numDays = scn.nextInt();
        double rate = scn.nextDouble();
        double t = scn.nextDouble();

        double curT = 0;
        double balance = 0;
        double distanceDays = 0;

        for(int i=0; i<numDays; i++){
            curT = scn.nextDouble();
            long money = scn.nextLong();

            balance += money;

            if(balance < 0){
                distanceDays = (distanceDays == 0 ? curT : distanceDays);
                balance *= (1 + (curT - distanceDays)/30 * rate);
            }else{
                distanceDays = 0;
            }
        }

        if(curT < t && balance < 0){
            balance = balance * (1 + (t - curT)/30 * rate);
        }


        System.out.println((long)Math.round(balance));

    }    
}
