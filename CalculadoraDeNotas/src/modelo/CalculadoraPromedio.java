package modelo;

import exceptions.NotaFeraDeRangoException;

public class CalculadoraPromedio {

	private int nota1;
	private int nota2;
	private int nota3;

	public CalculadoraPromedio(int nota1, int nota2, int nota3) throws NotaFeraDeRangoException {
		setNota1(nota1);
		setNota2(nota2);
		setNota2(nota3);
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) throws NotaFeraDeRangoException {
		if (nota1 <= 0 || nota1 > 100) {
			throw new NotaFeraDeRangoException();
		}
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) throws NotaFeraDeRangoException {
		if (nota2 <= 0 || nota2 > 100) {
			throw new NotaFeraDeRangoException();
		}
		this.nota2 = nota2;
	}

	public int getNota3() {

		return nota3;
	}

	public void setNota3(int nota3) throws NotaFeraDeRangoException {
		if (nota3 <= 0 || nota3 > 100) {
			throw new NotaFeraDeRangoException();
		}
		this.nota3 = nota3;
	}

	public double calcularPromedio(int nota1, int nota2, int nota3) throws NotaFeraDeRangoException {
		if (nota3 <= 0 || nota3 > 100 || nota2 <= 0 || nota2 > 100 || nota1 <= 0 || nota1 > 100) {
			throw new NotaFeraDeRangoException();
		}
		double promedio = (nota1 + nota2 + nota3) / 3;
		return promedio;
	}

	public String determinarAprobado(double promedio) {
		if (promedio >= 60) {
			return "Aprobado";
		}
		return "Reprobado";
	}
}
