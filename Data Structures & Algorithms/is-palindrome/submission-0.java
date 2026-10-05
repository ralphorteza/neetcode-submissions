class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i=0; i < s.length(); i++) {
            int j = s.length()-1 -i;
            if (i == j) break;
            // System.out.printf("i=%d, char[i]=%s, j=%d, char[j]=%s%n", i, s.charAt(i), j, s.charAt(j));
            if (s.charAt(i) != s.charAt(j)) return false;
            
        }

        return true;
    }
}
