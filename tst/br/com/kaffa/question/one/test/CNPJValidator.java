package br.com.kaffa.question.one.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CNPJValidator {

	private static final String NOT_FORMATTED_CNPJ_REGEX = "^\\d{14}?";
	private static final String FORMATTED_CNPJ_REGEX = "^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}-\\d{2}$";
	private static final int MINIMUM_DIGITS_CNPJ = 14;

	public static boolean isFormatValid(String cnpj) {

		if (!isOnlyDigits(cnpj)) {
			if(!hasBeenFormatted(cnpj))
				return false;
		}
		else if (!hasMinimumDigits(cnpj))
			return false;

		return true;
	}

	public static boolean hasMinimumDigits(String cnpj) {
		return cnpj.length() <= MINIMUM_DIGITS_CNPJ;
	}

	public static boolean hasBeenFormatted(String cnpj) {

		Pattern pattern = Pattern.compile(FORMATTED_CNPJ_REGEX);
		Matcher matcher = pattern.matcher(cnpj);

		return matcher.find();
	}
	
	public static boolean isOnlyDigits(String cnpj) {
		
		Pattern pattern = Pattern.compile(NOT_FORMATTED_CNPJ_REGEX);
		Matcher matcher = pattern.matcher(cnpj);
		
		return matcher.find();
	}
}
