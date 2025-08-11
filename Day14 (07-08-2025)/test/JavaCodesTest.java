package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import main.JavaCodes;

public class JavaCodesTest {
	JavaExample obj = new JavaExample();
	
	@Test
	public void testPortionOfList(){
		List<String> expected = Arrays.asList("Banana", "WaterMelon");
		List<String> actual = obj.extractPortionOfArrayList();
		assertEquals(expected,actual);
		
		
		
	}

}
