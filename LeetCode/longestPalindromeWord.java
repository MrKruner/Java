 
public class longestPalindromeWord {

    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        if(s.length()<2){
            return "";
        }
        for(int i=0; i < s.length(); i++){
            int lenEvenString = expandFromMiddile(s, i, i+1);
            int lenObbString = expandFromMiddile(s, i,i);

            int len = Math.max(lenEvenString, lenObbString);
            if(len> end-start+1){
                start = i - (len-1)/2;
                end = start + len -1;
            }
        }
        return s.substring(start, end+1);
    }

    public int expandFromMiddile(String string, int l, int r){
        while (l>=0 && r<=string.length() && string.charAt(l)==string.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}