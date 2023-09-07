class Solution {
    public int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int maxLength = 0 ,start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength,set.size());
            }else {
                while(s.charAt(start)!=s.charAt(i)){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.remove(s.charAt(start));
                start++;
                set.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}