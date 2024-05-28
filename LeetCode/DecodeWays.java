public class DecodeWays {

    public int numDecodings(String s) {

        if(s.charAt(0) == '0'){
            return 0;
        }

        return oneDigit(0, s, 0) + (s.length() > 1 ? twoDigit(0, s, 0) : 0);
    }

    public int oneDigit(int i, String s, int count){

        if(i > s.length() - 1 || s.charAt(i) - '0' == 0 || s.charAt(i) - '0' > 26 ){
            return 0;
        }

        if(i == s.length() - 1){
            return 1;
        }

        int countOneDigit = oneDigit(i + 1, s, count);

        int countTwoDigits = 0;


        if(i + 1 < s.length()){
            
            countTwoDigits = twoDigit(i + 1, s, count);
        }

        return count + countOneDigit + countTwoDigits;
    }

    public int twoDigit(int i, String s, int count){
        
        if(i + 1 > s.length() - 1 || s.charAt(i) - '0' == 0 || (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0') > 26){
            return 0;
        }

        if(i + 1 == s.length() - 1){
            return 1;
        }
        
        int countOneDigit = oneDigit(i + 2, s, count);
        int countTwoDigits = 0;

        if(i + 2 < s.length() - 1){
            countTwoDigits = twoDigit(i + 2, s, count);
        }

        return count + countOneDigit + countTwoDigits;
    }

    public static void main(String[] args) {
        DecodeWays solution = new DecodeWays();

        String s = "1111111";
        System.out.println(solution.numDecodings(s));
    }
}
