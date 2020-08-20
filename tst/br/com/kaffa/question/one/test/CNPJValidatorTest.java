package br.com.kaffa.question.one.test;

import static br.com.kaffa.question.one.test.CNPJValidator.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CNPJValidatorTest {

	@Test
	public void givenCNPJWithoutDigits_AndWithLessOfMinimumDigits_ShouldReturnFalse() {
		assertFalse(isFormatValid("abcdefghijlkmn"));
	}
	
	@Test
	public void givenNotFormattedCNPJ_AndWithLessOfMinimumDigits_ShouldReturnFalse() {
		assertFalse(isFormatValid("1234567890123"));
	}
	
	@Test
	public void givenCNPJNotFormatted_AndWithMinimumDigits_ShouldReturnTrue() {
		assertTrue(isFormatValid("12345678901234"));
	}
	
	@Test
	public void givenNotFormattedCNPJ_WithMoreOfMaximumDigits_ShouldReturnFalse() {
		assertFalse(isFormatValid("123456789012345"));
	}
	
	@Test
	public void givenFormattedCNPJ_AndWithLessOfMinimumDigits_ShouldReturnFalse() {
		assertFalse(isFormatValid("12.345.678/9012-3"));
	}
	
	@Test
	public void givenCNPJFormatted_AndWithMinimumDigits_ShouldReturnTrue() {
		assertTrue(isFormatValid("12.345.678/9012-34"));
	}
	
	@Test
	public void givenFormattedCNPJ_WithMoreOfMaximumDigits_ShouldReturnFalse() {
		assertFalse(isFormatValid("12.345.678/9012-345"));
	}
	
	@Test
	public void givenNotFormattedCNPJ_WithBlankSpace_ShouldReturnFalse() {
		assertFalse(isFormatValid("12340567 8901234"));
	}
	@Test
	public void givenFormattedCNPJ_WithBlankSpace_ShouldReturnFalse() {
		assertFalse(isFormatValid("12.345.6 78/9012-34"));
	}
	
}

