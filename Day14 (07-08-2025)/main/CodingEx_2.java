package main;

public class CodingEx_2 {

	// Method1
	public String highestFreqChar(String input) {
		if (input == null || input.length() == 0) {
			return "Input is empty";
		}

		int maxCount = 0;
		char maxChar = input.charAt(0);

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			int count = 0;

			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == currentChar) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				maxChar = currentChar;
			}
		}

		return maxChar + " " + maxCount;
	}

	// Method2
	public String replaceVowel(String input) {
		String vowels = "aeiouAEIOU";

		for (int i = 0; i < input.length(); i++) {
			if (vowels.indexOf(input.charAt(i)) != -1) {
				return input.substring(0, i) + '-' + input.substring(i + 1);
			}
		}
		return input;
	}

	// Method3
	public String countChar(String input) {
		int letters = 0;
		int digits = 0;
		int specials = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isLetter(ch)) {
				letters++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				specials++;
			}
		}

		return letters + " " + digits + " " + specials;
	}

	// Method4
	public String removeSpaces(String input) {
	    return input.replace(" ", "");
	}
	
	//Method5
	public String concatenateStrings(String str1, String str2) {
	    return str1 + str2;
	}
	
	//Question 1
	

}
