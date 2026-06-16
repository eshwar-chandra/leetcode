class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int l1 = 0, l2 = 0;
        
        // Loop while both strings still have characters
        while (l1 < word1.length() && l2 < word2.length()) {
            output.append(word1.charAt(l1));
            output.append(word2.charAt(l2));
            l1++;
            l2++;
        }
        
        // Append any remaining characters from word1
        if (l1 < word1.length()) {
            output.append(word1.substring(l1));
        } 
        // Append any remaining characters from word2
        else if (l2 < word2.length()) {
            output.append(word2.substring(l2));
        }
        
        return output.toString();
    }
}