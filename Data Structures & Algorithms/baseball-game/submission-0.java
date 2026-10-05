class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int temp;
        int temp2;
        int result = 0;

        for(String curr: operations) {
            System.out.println(curr);
            if (curr.equals("+")) {
                // sums previous 2 nums and push the sum
                temp2 = stack.pop();
                temp = stack.pop();
                stack.push(temp);
                stack.push(temp2);
                stack.push(temp + temp2);
            } else if (curr.equals("D")) {
                // doubles score of previous num and push the sum
                temp = stack.peek();
                stack.push(temp * 2);
            } else if (curr.equals("C")) {
                // invalidates previous num
                stack.pop();
            } else {
                // push num
                System.out.println("inside else");
                temp = Integer.parseInt(curr);
                stack.push(temp);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}