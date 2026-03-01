public class Java_Anagrams {
    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int[] freq = new int[26];
        
        for(int i = 0; i < a.length(); i++){
            freq[a.charAt(i) - 'a']++;
        }
        
        for(int i = b.length() - 1; i >= 0; i--){
            freq[b.charAt(i) - 'a']--;
        }
        
        for(int count : freq){
            if(count != 0)
                return false;
        }
        return true;
    }
}
