import java.util.Scanner;

public class EIUPH003 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        while (b>a || c>b) {
            if(b>a){
                int temp = a;
                a = b;
                b = temp;
            }

            if(c>b){
                int temp = b;
                b = c;
                c = temp;
            }
        }

        System.out.println(b);

        scn.close();
    }
}
