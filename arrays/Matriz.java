package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos Alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantidade de notas: ");
		int qtDeNotas = entrada.nextInt();
		
		double [][] notasTurma = new double [qtdAlunos][qtDeNotas];
		
		double total = 0;	
		for (int i = 0; i < notasTurma.length; i++) {
			for (int n = 0;	 n < notasTurma[i].length; n++) {
				System.out.printf("Informe a notas %d do aluno %d:\n", i + 1 ,n + 1);
				notasTurma[i][n] = entrada.nextDouble();
				total += notasTurma [i][n];
			}
			double media = total / (qtdAlunos * qtDeNotas);
			System.out.println("Média da turma é: " + media);
		}
	}

}
