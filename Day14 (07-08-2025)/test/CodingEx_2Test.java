package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.CodingEx_2;

public class CodingEx_2Test {
	CodingEx_2 coding = new CodingEx_2();
	
	@Test
	public void testReplaceFirstVowel_NormalCase() {
		String result = coding.replaceVowel("car");
		assertEquals("c-r", result);
	}

	@Test
	public void testCountCharacters() {
		assertEquals("3 3 3", coding.countChar("abc123!@#"));

	}

}
