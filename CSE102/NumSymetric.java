import java.util.Scanner;

/**
 * NumSymetric
 */
public class NumSymetric {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        long num = scn.nextLong();

        long reverseNum = 0;

        long temp = num;
        while (temp > 0) {
            long remainder = temp % 10;
            temp = temp / 10;

            reverseNum = (reverseNum * 10) + remainder;
        }

        System.out.println(reverseNum);
        if(reverseNum == num){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        scn.close();
    }   
    // Stringbuilder
}