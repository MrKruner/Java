import java.util.Scanner;

public class EIUPH002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int year = scn.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 != 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        
        System.out.println("NO");

        scn.close();
    }
}
