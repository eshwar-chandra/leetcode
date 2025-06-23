class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            result.append(str[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}