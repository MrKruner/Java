 
class longestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i< strs.length; i++){
            minLen = Math.min(minLen, strs[i].length());
        }

        if(minLen<=0){
            return "";
        }

        int base = 0, i=0;
        while(i<minLen){
            for(int str=1; str< strs.length; str++){
                if(strs[base].charAt(i) != strs[str].charAt(i)){
                    return strs[str].substring(0,i);
                }
            }
            i++;
        }
        return strs[base].substring(0,i);
    }

    public static void main(String[] args) {
        longestCommonPrefixSolution solution = new longestCommonPrefixSolution();
        System.out.println(solution.longestCommonPrefix(new String[]{"","d"}));
    }
}
