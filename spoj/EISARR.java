package spoj;

import java.util.Scanner;

public class EISARR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int lenArray = scn.nextInt();
        int lenSubArray = scn.nextInt();

        int[] array = new int[lenArray]; 
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<lenArray; i++){
            array[i] = scn.nextInt();
        }

        for(int i=0; i<lenArray - lenSubArray; i++){
            
            int sum = 0;

            int j = 0;
            
            while (j<lenSubArray) {
                sum += array[i + j];
                j++;
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
