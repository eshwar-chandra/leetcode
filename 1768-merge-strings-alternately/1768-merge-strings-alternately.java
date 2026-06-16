class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int l1 = 0, l2 = 0;
        while (l1 < word1.length() && l2 < word2.length()) {
            output.append(word1.substring(l1, l1+1));
            output.append(word2.substring(l2, l2+1));
            l1++;
            l2++;
        }
        if (l1 < word1.length()) {
            output.append(word1.substring(l1,word1.length()));
        } else {
            output.append(word2.substring(l2,word2.length()));
        }
        return output.toString();
        
    }
}