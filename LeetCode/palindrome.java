 
class palindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return  false;
        }
        int num = x;
        int reverseNum = 0;

        while(num!=0){
            int mod = num % 10;
            reverseNum = (reverseNum*10) + mod;
            num = num / 10;
        }
        return reverseNum == x;
    }
}