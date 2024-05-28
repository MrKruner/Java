import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int longestSide = a;
        int side1 = b;
        int side2 = c;

        if(longestSide < side1){
            int temp = longestSide;
            longestSide = side1;
            side1 = temp;
        }

        if(longestSide < side2){
            int temp = longestSide;
            longestSide = side2;
            side2 = temp;
        }


        float halfSum = (a + b + c)/2;

        if( halfSum > a && halfSum > b && halfSum > c){
            if(a == b && b == c){
                System.out.println("Equilateral triangle");
            }else if(a==b || b==c || a==c){
                System.out.println("Isosceles triangle");
            }else if(Math.pow(longestSide, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)){
                System.out.println("Right-triangle");
            }else if(Math.pow(longestSide, 2) > Math.pow(side1, 2) + Math.pow(side2, 2)){
                System.out.println("Obtuse-triangle");
            }else {
                System.out.println("Scalene triangle");
            }
        }else{
            System.out.println("It is not a triangle");
        }
        
        scn.close();

    }
}
