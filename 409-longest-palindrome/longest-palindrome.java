class Solution {
    public int longestPalindrome(String s) {
        
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for(int freq : map.values()) {
            if(freq % 2 == 0) length += freq;
            else {
                length += freq - 1;
                hasOdd = true;
            }
        }

        if(hasOdd) length += 1;

        return length;
    }
}