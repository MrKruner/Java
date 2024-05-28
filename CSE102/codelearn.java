import java.util.Scanner;

public class codelearn {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        String name = scn.next();
		String address = scn.next();

		System.out.println("Name: " + name + "\n" + "Address: " + address);

        scn.close();

	}
}