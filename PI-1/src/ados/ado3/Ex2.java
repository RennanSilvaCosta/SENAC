package ados.ado3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double x, y, z;
		System.out.print("Digite o lado X: ");
		x = entrada.nextDouble();
		System.out.print("Digite o lado Y: ");
		y = entrada.nextDouble();
		System.out.print("Digite o lado Z: ");
		z = entrada.nextDouble();

		if (x + y > z && x + z > y && z + y > x) {
			System.out.println("Os tres valores formam um Triangulo");
			if (x == y && y == z) {
				System.out.println("� um Equil�tero");
			} else if (x == y && z == x && y == z) {
				System.out.println("� um Is�sceles");
			} else {
				System.out.println("� um Escaleno");
			}
		} else {
			System.out.println("Os tr�s valores N�O formam um Triangulo");
		}
		entrada.close();
	}

}
