//package Java.Placement Qns;


    public class Pangram {
        public static boolean isPangram(String str) {
            // Convert the input string to lowercase for case-insensitive comparison
            str = str.toLowerCase();
    
            // Create a boolean array to track the presence of each letter
            boolean[] alphabetPresent = new boolean[26];
    
            // Iterate through the characters in the string and mark their presence
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    alphabetPresent[ch - 'a'] = true;
                }
            }
    
            // Check if all letters of the alphabet are present
            for (boolean letterPresent : alphabetPresent) {
                if (!letterPresent) {
                    return false;
                }
            }
    
            return true;
        }
    
        public static void main(String[] args) {
            String sentence = "The quick brown fox jumps over the lacy dog";
    
            if (isPangram(sentence)) {
                System.out.println("The sentence is a pangram.");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        }
    }
    

