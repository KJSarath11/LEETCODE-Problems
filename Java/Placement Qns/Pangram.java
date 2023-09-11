class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean answer = false;
			for(char alpha = 'a' ; alpha<='z' ; alpha++) {
		        	if(sentence.indexOf(alpha) == -1) {
		        		answer= false;//not pangram
		        		break;
		        	}else {
		        		answer= true;
		        	}
		        }
		        return answer;
    }
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test the checkIfPangram method with a sample sentence
        String sentence = "the quick brown fox jumps over the lazy dog";
        boolean isPangram = solution.checkIfPangram(sentence);

        // Print the result
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}