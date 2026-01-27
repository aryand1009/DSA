class Solution {
    public int repeatedStringMatch(String a, String b) {
        String repeated = a;
        int count = 1;
        
        //repeat until repeated.length() > b.length
        while(repeated.length() < b.length()) {
            repeated += a;
            count++;
        }

        if(repeated.contains(b)) {
            return count;
        }

        repeated += a;
        if(repeated.contains(b)) return count+1;

        return -1;
    }
}