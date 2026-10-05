class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i < s.length(); i++) {
            char currChar = s.charAt(i); 
            if (!map.containsKey(currChar)) {
                map.put(currChar, 0);
            }
            map.put(currChar, map.get(currChar) + 1);
        }

         for (int j=0; j < t.length(); j++) {
            char currChar = t.charAt(j); 
            if (!map.containsKey(currChar)) {
                return false;
            }
            if (map.get(currChar) < 0) return false;

            map.put(currChar, map.get(currChar) - 1);
        }
        
        for (Integer val: map.values()) {
            if (val != 0) return false;
        }

        return true;

    }
}
