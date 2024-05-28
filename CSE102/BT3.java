import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        while(a>b || b>c){
            int temp = a;
            a = b;
            b = temp;
            if(b>c){
                temp = b;
                b = c;
                c = temp;
            }
        }

        System.out.printf("%d%d%d", a, b, c);

        scn.close();
    }
}
        