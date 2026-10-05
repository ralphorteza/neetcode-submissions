class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        HashSet<Integer> seen = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++){
            int product = 1;
            // seen.add(product);
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            arr[i] = product;
        }

        return arr;
    }
}  
