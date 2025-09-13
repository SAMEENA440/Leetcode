// class Solution {
//     public int maxFreqSum(String s) {
//         Map<Character, Integer> freq = new HashMap<>();
//         int con = 0, vow = 0;
//         for (char c : s.toCharArray()) {
//             freq.put(c, freq.getOrDefault(c, 0) + 1);
//         }
//         for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
//             char ch = entry.getKey();
//             int count = entry.getValue();
//             if ("aeiou".indexOf(ch) >= 0)
//                 vow = Math.max(vow, count);
//             else
//                 con = Math.max(con, count);
//         }
//         return con + vow;
//     }
// }




class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        String vowels = "aeiou";
        int maxVowel = 0, maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char c = (char)(i + 'a');
                if (vowels.indexOf(c) != -1) {
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}