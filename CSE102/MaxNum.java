import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        int maxNum = num1;

        if(num2 > maxNum){
            maxNum = num2;
        }

        if(num3 > maxNum){
            maxNum = num3;
        }

        System.out.printf("The maximum number is: %d",maxNum);

        scn.close();
    }
}
