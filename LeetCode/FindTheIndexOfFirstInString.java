class FindTheIndexOfFirstStringSolution {
    public int strStr(String haystack, String needle) {
        int r=needle.length();
        if(r>haystack.length()){
            return -1;
        }
        for(int i=0;i<=haystack.length();i++){
            System.out.println(haystack.substring(i, r));
            if(haystack.substring(i, r).equals(needle)){
                return i;
            }else if(r>=haystack.length()){
                return -1;
            }
            r++;
        }
        return -1;
    }

    // Best Solution , think before do
    public int strStr2(String hayStack, String needle){
        int index =-1;
        index = hayStack.indexOf(needle);
        return index;
    }

    public static void main(String[] args) {
        FindTheIndexOfFirstStringSolution solution = new FindTheIndexOfFirstStringSolution();
        String str= "abc";
        System.out.println(solution.strStr(str, "c"));        
    }
}