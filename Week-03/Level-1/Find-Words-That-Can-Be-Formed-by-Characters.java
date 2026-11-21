class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        
        for(int i=0; i<words.length; i++){
            if(words[i].length() > chars.length()){
                continue;
            }

            HashMap<Character, Integer>  map = new HashMap<>();

            for(int j=0; j<chars.length(); j++){
                map.put(chars.charAt(j), map.getOrDefault(chars.charAt(j), 0) + 1);
            }

            boolean possible = true;

            for(int j=0; j<words[i].length(); j++){
                if(map.containsKey(words[i].charAt(j)) && map.get(words[i].charAt(j)) >= 1){
                    map.put(words[i].charAt(j), map.get(words[i].charAt(j)) - 1);
                }

                else{
                    possible = false;
                    break;
                }
            }

            if(possible)
                sum += words[i].length();
        }

        return sum;
    }
}
