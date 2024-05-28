package spoj;

import java.util.Scanner;

class EIDISCOUNT1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        long money = scn.nextLong();

        long[] markedAmount = {0, 2000000, 10000000, 50000000, 100000000, 200000000, 500000000};
        double[] discount = {1, 0.97, 0.95, 0.93, 0.9, 0.88, 0.85}; 

        long payment = 0;

        for(int i = markedAmount.length-1; i>=0; i--){
            if(money > markedAmount[i]){
                payment += (long)((money - markedAmount[i]) * discount[i]);
                money = markedAmount[i];
            }
        }

        System.out.println(payment);

        scn.close();
    }
}

// Dưới 5 triệu đồng: giảm 0% giá trị
// Từ trên 5 triệu đến 20 triệu: giảm 3% giá trị
// Từ trên 20 triệu đến 100 triệu: giảm 5% giá trị
// Từ trên 100 triệu đến 300 triệu: giảm 7% giá trị
// Từ trên 300 triệu đến 600 triệu: giảm 10% giá trị
// Từ trên 600 triệu đến 900 triệu: giảm 12% giá trị
// Trên 900 triệu: giảm 15% giá trị