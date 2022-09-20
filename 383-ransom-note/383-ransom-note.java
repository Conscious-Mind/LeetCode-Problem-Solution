class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ran = new HashMap<>();
        HashMap<Character, Integer> mag = new HashMap<>();
        
        for (int i = 0; i < ransomNote.length(); i++){
            ran.merge(ransomNote.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < magazine.length(); i++){
            mag.merge(magazine.charAt(i), 1, Integer::sum);
        }
        
        for (Character key: ran.keySet()) {
            if (mag.get(key) == null)
                return false;
            if (ran.get(key) > mag.get(key))
                return false;
        }
        return true;
        
    }
}