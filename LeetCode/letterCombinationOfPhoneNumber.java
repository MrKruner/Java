 
import java.util.ArrayList;
import java.util.List;

class letterCombinationOfPhoneNumberSolution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }

        String[][] letters = {{"a","b","c"},{"d","e","f"},{"g","h","i"},
        {"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};

        int[] phoneNum= {2,3,4,5,6,7,8,9};

        List<String> result = new ArrayList<>();

        for(int i=0; i<digits.length(); i++){
            int intDigit = Character.getNumericValue(digits.charAt(i));
            for(int j=0;j<phoneNum.length;j++){
                if(intDigit == phoneNum[j]){
                    if(result.isEmpty()){
                        for(int indLetter=0; indLetter<letters[j].length; indLetter++){
                            result.add(letters[j][indLetter]);
                        }
                        continue;
                    }

                    List<String>tempList = new ArrayList<>();
                    tempList = result;
                    result = new ArrayList<>();
                    for(int k=0; k<tempList.size();k++){
                        for(int indLetter=0; indLetter<letters[j].length; indLetter++){
                            String element = tempList.get(k) + letters[j][indLetter];
                            result.add(element);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        letterCombinationOfPhoneNumberSolution solution = new letterCombinationOfPhoneNumberSolution();
        System.out.println(solution.letterCombinations("22"));
    }
}
