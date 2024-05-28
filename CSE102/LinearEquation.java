import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        float result = 0;

        if(a != 0){
            result = -((float)b/a);
            System.out.printf("One solution: %.2f",result);

        }else if(a == 0 && b != 0){
            System.out.println("No solution");
        }else if(a==0 && b == 0){
            System.out.println("Infintely many solutions");
        }

        scn.close();
    }
}
