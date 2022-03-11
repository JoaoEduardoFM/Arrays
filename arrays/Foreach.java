package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = {9.0,8.2,8.5,7.0};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf(notas[i] + " ");
		}
		System.out.println();
	
	for(double nota: notas) {
		System.out.printf(nota + " ");
	}

}
}
