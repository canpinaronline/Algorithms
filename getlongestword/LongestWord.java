package getlongestword;

public class LongestWord {
	
	/* 
	 * 
	 * Get longest word in sentence.
	 * 
	 * Example: Learning programming is fun.
	 * Description: When you break the sentence according to the spaces, 
	 * 				the lengths of the words:
	 *              
	 *               Learning(8)
	 *               Programming(11)
	 *               is(2)
	 *               fun.(4)
	 *  
	 *               
	 * Returns: Programming              
	 * */
	public String LongestWord(String sentence) {
	    
		String[] wordArray = sentence.split(" ");
		String longestWordInArray = "";
		int longestWordsLength = 0;
		
		for(int i = 0; i<wordArray.length;i++) {
			if (wordArray[i].length() > longestWordsLength) {
				longestWordInArray = wordArray[i];
				longestWordsLength = wordArray[i].length();
			}
			
		}
	    
		return longestWordInArray;
	  }


}
