import java.util.Scanner;

public class EIUPH005 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();
        String gender = scn.next();

        int[] ages = {0, 5, 20, 20, 35, 35, 60, 60};
        String[] pronouns = {"Be", "Em", "Anh", "Chi", "Chu", "Co", "Ong", "Ba"};
        String[] genders = {"Nam", "Nu"};

        for(int i = ages.length-1 ;i >= 0; i--){

            if(age > ages[i]){
                if(age >= 20 && gender.equals(genders[i%2])){
                    System.out.println(pronouns[i]);
                    break;
                }else if(age <= 20){
                    System.out.println(pronouns[i]);
                    break;
                }
            }
        }
        
        scn.close();

    }
}
