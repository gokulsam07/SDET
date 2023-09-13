package mandatoryHomeWork.postfoundationDailyHW;

public class Sep13CW_PalindromeAfterRemoval {

	//Ip: String, int
	//op true or false
	//Logic
	//1. Init a sb and pass the string
	//2. Run a for loop, delete charAt(i) of sb
	//check if the sb is palindrome after converting to string, if yes return true
	//else add the removed char to sb by taking the char from string
	//Palindrome check logic
	// s.equals --> pass the s to sb> reverse > to String and check with s
	
	//Time complexity -- O[N2]
	
	public static boolean validPalindrome(int n, String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			sb.deleteCharAt(i);

			if(isPalindrome(sb.toString())){
				return true;
			} else {
				sb.insert(i, s.charAt(i));
			}
		}
		return false;
	}

	public static boolean isPalindrome(String cmp) {
		return cmp.equals(new StringBuilder(cmp).reverse().toString());
	}

}
