class Solution {

    private final int[] values;
    private final String[] romanNumerals;

    public Solution() {
        this.values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        this.romanNumerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    }
    
    public String intToRoman(int num) {
    

        StringBuilder sb = new StringBuilder();

        int i = 0;
    
        while (num > 0) {
            if (num >= values[i]) {
                
                sb.append(romanNumerals[i]);
                num -= values[i];
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}