import java.util.Scanner;

public class PolynomialEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a==0){
            float result = 0;

            if(b != 0){
                result = -((float)b/a);
                System.out.printf("One solution: %.2f",result);
            }else if(b == 0 && c != 0){
                System.out.println("No solution");
            }else if(b ==0 && c == 0){
                System.out.println("Infintely many solutions");
            }
        }else{
            double delta = Math.pow(b, 2) - (4 * a * c);

            if(delta < 0){
                System.out.println("No solution");
            }else if(delta == 0){
                System.out.printf("Double root: %.2f", -(b / (2*a)) );
            }else{
                double x1 = (-b + Math.sqrt(delta)) / (2*a); 
                double x2 = (-b - Math.sqrt(delta)) / (2*a); 

                System.out.printf("System has 2 solution: %.2f and %.2f", x1, x2);
            }
        }

        scn.close();

    }
}
