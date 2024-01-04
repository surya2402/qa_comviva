package com.comviva.assessment;

import org.junit.Test;

import com.comviva.assessment.stringutil.StringUtils;

import junit.framework.Assert;

public class StringUtilsTest {
	
	@Test
	public void reverseString() {
		// Test reversing a string using StringUtils
		StringUtils stringService = new StringUtils();
		String actualResult = stringService.reverse("hello");
		String expectedResult = "olleh";
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void isPalindromeStringTrueCase() {
		// Test checking if a palindrome string is identified correctly
		StringUtils stringService = new StringUtils();
		boolean actualResult = stringService.isPalindrome("radar");
		boolean expectedResult = true;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void isPalindromeStringFalseCase() {
		// Test checking if a non-palindrome string is identified correctly
		StringUtils stringService = new StringUtils();
		boolean actualResult = stringService.isPalindrome("hello");
		boolean expectedResult = false;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void concatenateString() {
		// Test concatenating two strings using StringUtils
		StringUtils stringService = new StringUtils();
		String actualResult = stringService.concatenate("Hello", "World");
		String expectedResult = "HelloWorld";
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void countOccurrencesString() {
		// Test counting occurrences of a character in a string using StringUtils
		StringUtils stringService = new StringUtils();
		Integer actualResult = stringService.countOccurrences("hello", 'l');
		Integer expectedResult = 2;
		Assert.assertEquals(expectedResult, actualResult);
	}
}
