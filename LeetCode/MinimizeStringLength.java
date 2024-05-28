class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        
        int chr[] = new int[26];

        for(int i=0; i<s.length(); i++){
            chr[s.charAt(i)-'a']++;
        }

        int count = 0;

        for(int n : chr){
            if(n != 0){
                count++;
            }
        }
        
        return count;
    }    
}
