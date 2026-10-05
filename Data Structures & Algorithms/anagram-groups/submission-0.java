class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        // Edge cases
        HashMap<String, List<String>> seen = new HashMap<>();
        List<List<String>> anagramSorted = new ArrayList<>();
        //loop thru elements
        for (String word: strs) {
            char[] charr = word.toCharArray();
            Arrays.sort(charr);

            String key = new String(charr);

            if (!seen.containsKey(key)) {
                seen.put(key, new ArrayList<String>());
            }

            seen.get(key).add(word);
            System.out.print(word+ "\n");
        
        }

        System.out.print(seen);

        for (List<String> group: seen.values()) {
            anagramSorted.add(group);
        }
        return anagramSorted;
       
    }
}
