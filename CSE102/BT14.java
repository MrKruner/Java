import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int date = scn.nextInt();
        int month = scn.nextInt();
        // int year = scn.nextInt();

        int[] validDate = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(1<=month && month<=12){
            if(1<=date && date<=validDate[month]){
                System.out.println("VALID");
            }else{
                System.out.println("INVALID");
            }
        }else{
            System.out.println("INVALID");
        }

        scn.close();
    }
}