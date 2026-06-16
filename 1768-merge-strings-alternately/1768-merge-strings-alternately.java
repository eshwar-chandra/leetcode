class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        
        // 1. Pre-allocate the exact memory needed
        StringBuilder output = new StringBuilder(len1 + len2);
        
        int i = 0;
        
        // 2. Use a single pointer for the loop
        while (i < len1 && i < len2) {
            output.append(word1.charAt(i));
            output.append(word2.charAt(i));
            i++;
        }
        
        // 3. Append the remainders directly without creating new substring objects
        if (i < len1) {
            output.append(word1, i, len1);
        } else if (i < len2) {
            output.append(word2, i, len2);
        }
        
        return output.toString();
    }
}