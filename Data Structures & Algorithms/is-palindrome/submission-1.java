class Solution {
    public boolean isPalindrome(String s) {
        String modified_s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = modified_s.length() - 1;

        while (i < j) {
            System.out.println(modified_s.charAt(i) + " " + modified_s.charAt(j) +"\n");
            if (modified_s.charAt(i) != modified_s.charAt(j)) {
                return false;
            }
            i++; j--;
        }

        return true;

    }
}
