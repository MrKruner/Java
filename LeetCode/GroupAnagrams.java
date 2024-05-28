 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> resuList = new ArrayList<>();

        Map<String, List<String>> wordSortedMap = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if(!wordSortedMap.containsKey(sortedStr)){
                wordSortedMap.put(sortedStr, new ArrayList<>());
            }

            wordSortedMap.get(sortedStr).add(str);
        }

        for(Map.Entry<String, List<String>> entry: wordSortedMap.entrySet()) {
            resuList.add(entry.getValue());
        }

        return resuList;
        
    //     for(int i = 0; i < strs.length; i++){
    //         List<String> tempList = new ArrayList<>();
    //         tempList.add(strs[i]);

    //         for(int j=i+1; j < strs.length; j++){
    //             if(strs[i].length() != strs[j].length()){
    //                 continue;
    //             }
    //             // System.out.println(strs[i]);
    //             // System.out.println(strs[j]);
    //             boolean isIncluded = true;

    //             for(int k=0; k<strs[i].length(); k++){
    //                 for(int l=0; l<strs[j].length(); l++){
    //                     // System.out.println(strs[i].charAt(k));
    //                     // System.out.println(strs[j].charAt(l));
    //                     if(strs[i].charAt(k) == strs[j].charAt(l)){
    //                         isIncluded = true;
    //                         break;

    //                     }if(strs[i].charAt(k) != strs[j].charAt(l)){
    //                         isIncluded = false;
    //                     }
    //                 }
    //                 if(isIncluded == false){
    //                     break;
    //                 }
    //             }

    //             if(isIncluded == true){
    //                 tempList.add(strs[j]);

    //                 String[] newArray = new String[strs.length-1];

    //                 for(int l=0; l<j; l++){
    //                     newArray[l] = strs[l];
    //                 }
    //                 for(int l=j+1; l<strs.length; l++){
    //                     newArray[l-1] = strs[l];
    //                 }
    //                 strs = newArray;

    //                 // System.out.println(tempList);
    //             }
    //         }

    //         resuList.add(tempList);
    //     }

    //     return resuList;
    // }
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"",""};
        System.out.println(solution.groupAnagrams(strs));
    }
}
