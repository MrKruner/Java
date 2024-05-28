package spoj;

import java.util.Scanner;

public class EIMONE {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        // Data Driven Programing
        int[] denomination = {20,10,5,1};
        int[] numOfDenomination = {0,0,0,0};

        for (int i=0; i<denomination.length; i++){
            numOfDenomination[i] = num/denomination[i];
            num = num%denomination[i];
            if(numOfDenomination[i] == 0){
                continue;
            }
            System.out.printf("%d %d \n", denomination[i], numOfDenomination[i]);
        }
        
        scn.close();
    }
}
