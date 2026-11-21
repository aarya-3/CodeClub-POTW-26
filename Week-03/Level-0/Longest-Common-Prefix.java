class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs[0].length();

        for(int i=1; i<strs.length; i++){
            int count = 0, j = 0;
            while((j < strs[i].length() && j < strs[0].length()) && strs[i].charAt(j) == strs[0].charAt(j)){
                j++;
                count++;
            }
            length = Math.min(length, count);
        }

        return strs[0].substring(0, length);
    }
}
