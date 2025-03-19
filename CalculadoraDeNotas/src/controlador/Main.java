package controlador;

import java.util.Scanner;

import exceptions.NotaFeraDeRangoException;
import modelo.CalculadoraPromedio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;

		while (seguir) {

			try {
				System.out.print("Introduce la primera nota: ");
				int nota1 = sc.nextInt();
				System.out.print("introduce la segunda nota: ");
				int nota2 = sc.nextInt();
				System.out.print("introduce la tercera nota: ");
				int nota3 = sc.nextInt();
				CalculadoraPromedio c1 = new CalculadoraPromedio(nota1, nota2, nota3);

				System.out.println("El promedio de la nota es: " + c1.calcularPromedio(nota1, nota2, nota3));
				System.out.println("El alumno esta " + c1.determinarAprobado(c1.calcularPromedio(nota1, nota2, nota3)));
			} catch (NotaFeraDeRangoException e) {
				System.out.println(e);
			}
			System.out.print("Si deseas parar introduce -1 sino introduce cualquier numero: ");
			int parar = sc.nextInt();
			if (parar == -1) {
				System.out.println("Saliendo de la aplicacion...");
				seguir = false;
			}
		}
	}

}
