package spoj;

import java.util.Arrays;
import java.util.Scanner;

class EIAUCTION {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int lenArray = scn.nextInt();
        int[] group = new int[lenArray];

        for(int i=0; i<lenArray; i++){
            group[i] = scn.nextInt();
        }

        int maxNum = 0;

        int[] tempGroup = Arrays.copyOf(group, lenArray);
        Arrays.sort(group);


        for(int i=lenArray-1; i>=0; i--){

            int j = i - 1;

            if(i == 0){
                maxNum = group[i];
                break;
            }

            if(j >= 0 && group[i] != group[j]){
                maxNum = group[i];
                break;
            }

            while (j >= 0 && group[i] == group[j]) {
                j--;
            }
            
            
            i = j + 1;
        }

        if(maxNum != 0){
            for(int i=0; i<lenArray; i++){
                if(tempGroup[i] == maxNum){
                    System.out.println(i + 1);
                }
            }
        }else{
            System.out.println("none");
        }
        
        
    }
}
