package day7;

public class PalindromeCheck {
	public boolean isPalindrome(String name) {
		int left = 0;
		int right = name.length() - 1;

		while (left < right) {
			if (name.charAt(left) != name.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
