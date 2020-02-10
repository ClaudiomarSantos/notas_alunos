package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudante;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();

		System.out.println("digite o nome do aluno: ");
		estudante.nome = sc.nextLine();

		System.out.println("digite as notas do aluno: ");
		estudante.nota1 = sc.nextInt();
		estudante.nota2 = sc.nextInt();
		estudante.nota3 = sc.nextInt();

		estudante.soma = estudante.somaNota();

		System.out.println("total: " + estudante.soma);

		if (estudante.nota1 > 30 || estudante.nota2 > 35 || estudante.nota3 > 35) {
			System.out.println("nota inválida");
		} else {
			if (estudante.soma >= 60) {
				System.out.println("passou de ano");
			} else {
				System.out.println("reprovado!!!");
				System.out.println("pontos faltantes: " + ((estudante.soma - 60) * -1));
			}

			sc.close();
		}

	}
}
