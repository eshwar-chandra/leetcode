class Solution {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    // public void Solution() {
    //     this.roman = new HashMap<>();
    //     roman.put(1, "I");
    //     roman.put(5, "V");
    //     roman.put(10, "X");
    //     roman.put(50, "L");
    //     roman.put(100, "C");
    //     roman.put(500, "D");
    //     roman.put(1000, "M");
    //     values = {1000, 500, 100, 50, 10, 5, 1};
    // }
    
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