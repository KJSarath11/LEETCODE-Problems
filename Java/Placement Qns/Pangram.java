class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean answer = false;
			for(char alpha = 'a' ; alpha<='z' ; alpha++) {
		        	if(sentence.indexOf(alpha) == -1) {
		        		answer= false;
		        		break;
		        	}else {
		        		answer= true;
		        	}
		        }
		        return answer;
    }
}