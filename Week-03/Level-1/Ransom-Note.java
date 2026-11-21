class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            int currentCount = map.getOrDefault(c, 0);

            if(currentCount == 0){
                return false;
            }

            map.put(c, currentCount - 1);
        }

        return true;
    }
}
