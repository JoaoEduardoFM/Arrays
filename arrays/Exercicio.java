package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double [] notaAluno1 = new double [3];
		
		notaAluno1[0] = 7.9;
		notaAluno1[1] = 6.0;
		notaAluno1[2] = 5.5;
		
		System.out.println(Arrays.toString(notaAluno1));
		System.out.println(notaAluno1[0]);
		
		double totalAluno1 = 0;
		for (int i = 0; i < notaAluno1.length; i++) {
			totalAluno1 += notaAluno1[i];
		}
		
		System.out.println("A média da nota do aluno 1 é: " + totalAluno1 / notaAluno1.length);
		
		double [] notaAluno2 = {7.0,8.1,6.5};
		
		double  totalAluno2 = 0;
		for (int i = 0; i < notaAluno2.length; i++) {
			totalAluno2 += notaAluno2[i];
		}
		
		System.out.println("A média da nota do aluno 1 é: " + totalAluno2 / notaAluno2.length);
		
		final double notaArmazenada = 5.9;
		double [] notaAlunoB= {6.9,8.9, notaArmazenada,10};
}
}


