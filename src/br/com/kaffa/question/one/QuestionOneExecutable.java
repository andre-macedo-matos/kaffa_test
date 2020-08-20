package br.com.kaffa.question.one;

import java.io.IOException;
import java.util.Scanner;

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
			System.out.println("CNPJ n�o apresenta um formato v�lido!!!");
		else
			System.out.println("CNPJ apresenta Formato v�lido!!!");
	}

}
