
import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int weight = scn.nextInt();

        boolean isValid = true;

        System.out.println(weight);

        while (isValid && weight != 2) {

            if(weight % 2 != 0){
                isValid = false;
            }

            weight /= 2;
        }

        if (isValid) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
