class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Deque<Character> stack = new ArrayDeque<>();
        
        int i = 0;

        while (i < s.length()) {
            char currChar = s.charAt(i);

            if ((currChar == '(') ||
                (currChar == '[') ||
                (currChar == '{')) {
                stack.push(currChar);
            } else if (!stack.isEmpty() && currChar == ')' && (stack.peek() == '(')) {
                stack.pop();
            } else if (!stack.isEmpty() && currChar == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (!stack.isEmpty() && currChar == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(currChar);
            }
            i++;
        }

        

        return stack.isEmpty();
    }
}
