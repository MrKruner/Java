 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Failed out of output
class MySolutionLengthOfLongestSubstring {
    
    public Integer lengthOfLongestSubstring(String s) {
        int maxLen =0, len=0;

        for(int i=0; i < s.length(); i++){
            len = getLenOfSubString(s, i, i).length();
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public String getLenOfSubString(String s, int i, int r){
        String cSubString="";
        cSubString = cSubString + s.charAt(i);
        boolean isIncluded = false;
        while(r< s.length()-1){
            r++;
            isIncluded= cSubString.contains(String.valueOf(s.charAt(r)));
            if(isIncluded==true){
                break;
            }
            cSubString = cSubString + s.charAt(r);
            System.out.println(cSubString);
            System.out.println(isIncluded);

        }
        return cSubString;
    }

    public static void main(String[] args) {
        MySolutionLengthOfLongestSubstring solution = new MySolutionLengthOfLongestSubstring();
        System.out.println(solution.lengthOfLongestSubstring("abc abcbb")); 
    };
}


class LearntSolutionLengthOfLongestSubstring {
    public Integer lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l=0, maxLen =0;
        for(int r=l; r<s.length();r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            maxLen = Math.max(maxLen, charSet.size());
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LearntSolutionLengthOfLongestSubstring solution = new LearntSolutionLengthOfLongestSubstring();
        System.out.println(solution.lengthOfLongestSubstring(" "));
    }
}

class CantUnderstandSolution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() == 0) { return 0; }
        
        int longestSoFar = 1;
        final Set<Character> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        
        while (right < s.length()) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
            } else {
                // longestSoFar = Math.max(longestSoFar, (right - left));
                while (s.charAt(left) != s.charAt(right)) {
                    seen.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
            
            right++;
            longestSoFar = Math.max(longestSoFar, (right - left));
        }
        
        return longestSoFar;
    }
    public static void main(String[] args) {
        CantUnderstandSolution solution = new CantUnderstandSolution();
        System.out.println(solution.lengthOfLongestSubstring("abba"));
    }
}

class hashMapSolution{
    public int lengthOfLongestSubstring(String s) {

        if(s=="" || s.isEmpty()){
            return 0;
        }

        Map<Character, Integer> hashmap = new HashMap<>();
        int l=0, r=0;
        int maxLen = 0;

        while(r<s.length()){

            if(hashmap.containsKey(s.charAt(r)) && hashmap.get(s.charAt(r))>= l){
                l = hashmap.get(s.charAt(r)) + 1;
            }
            maxLen = Math.max(maxLen, r-l+1);
            hashmap.put(s.charAt(r),r);
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        CantUnderstandSolution solution = new CantUnderstandSolution();
        System.out.println(solution.lengthOfLongestSubstring("abba"));
    }
}