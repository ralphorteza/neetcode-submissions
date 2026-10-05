class Solution {
    public boolean isAnagram(String s, String t) {
        // Edge cases
        if (s.length() != t.length()) return false;

        // Create hashmap of s characters
        HashMap<Character, Integer> charBank = new HashMap<>();

        // interate thru s char in order and collect occurrence of each letter
        for (int i = 0; i < s.length(); i++) {
            char curr_char = s.charAt(i);

            if (!charBank.containsKey(curr_char)) charBank.put(curr_char, 1);
            else charBank.put(curr_char, charBank.get(curr_char) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char curr_char = t.charAt(j);
            if (charBank.containsKey(curr_char)) {
                charBank.put(curr_char, charBank.get(curr_char) - 1);
            } else {
                return false;
            }
        }

        for (int value: charBank.values()) {
            if (value == 0) continue;
            else return false;
        }
        return true;

    }
}
