 
class integerToRomanSolution {
    public String intToRoman(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String romanNum ="";

        for(int i=0; i<values.length; i++){
            int numOfLetter = num/values[i];
            num = num%values[i];

            while(numOfLetter>0){
                romanNum += romanLetters[i];
                numOfLetter--;
            }
        }
        return romanNum;
    }

    public static void main(String[] args) {
        integerToRomanSolution solution = new integerToRomanSolution();
        System.out.println(solution.intToRoman(1000));
    }
}
