package spoj;

import java.util.Scanner;

public class EIGROSS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numPeople = scn.nextInt();
        for(int i=0; i<numPeople; i++){
            double afterTax = scn.nextDouble();

            double beforeTax = afterTax*10/9;

            double tax = beforeTax - afterTax;

            System.out.println(tax);
        }

        scn.close();
    }
}
