package br.com.kaffa.question.one;

import java.io.IOException;
import java.util.Scanner;

import br.com.kaffa.question.one.test.CNPJValidator;

public class QuestionOneExecutable {

	/**
	 * @param args
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um CNPJ: ");
		String cnpj = scanner.next();
		
		if(!CNPJValidator.isFormatValid(cnpj))
			System.out.println("CNPJ não apresenta um formato válido!!!");
		else
			System.out.println("CNPJ apresenta Formato válido!!!");
	}

}
