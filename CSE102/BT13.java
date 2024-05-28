
import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        String[] listHundred = {"", "one hundred", "two hundred", "three hundre", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        String[] listTens = {"and", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] listTeens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] listUnit = {"", "one", "two", "three", "four", "five", "six","seven", "eight", "nine"};
        
        int hundredDigit = num/100;
        int midDigit = (num / 10) % 10;
        int unitDigit = num % 10;

        String hundred = "";
        String tens = "";
        String unit = "";

        hundred = listHundred[hundredDigit];
        unit = listUnit[unitDigit];

        if(midDigit == 0 && unitDigit ==0){
            tens = "";
            unit = listUnit[0];
        }else if(midDigit == 1 && unitDigit == 0){
            tens = listTens[1];
        }else if(midDigit == 1 && unitDigit != 0){
            tens = listTeens[midDigit-1];
            unit = listUnit[0];
        }else{
            tens = listTens[midDigit];
        }

        System.out.printf("%s %s %s", hundred, tens, unit);

        scn.close();
    }
}
