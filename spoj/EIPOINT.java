package spoj;

import java.util.Scanner;

class EIPOINT {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int score = scn.nextInt();

        int[] grades = new int[] {90, 85, 80, 75, 70, 65, 60 ,55, 53, 52, 50, 0};
        String[] letters = new String[] {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };

        for(int i=0; i < grades.length; i++){
            if(score >= grades[i]){
                System.out.println(letters[i]);
                break;
            }
        }

        scn.close();
    }
}
