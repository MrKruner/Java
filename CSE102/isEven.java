import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();

        if(n%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        scn.close();
    }
}