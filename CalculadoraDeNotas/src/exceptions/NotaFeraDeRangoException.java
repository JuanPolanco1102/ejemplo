package exceptions;

public class NotaFeraDeRangoException extends Exception {

	@Override
	public String toString() {
		return "La nota introducida debe estar en un rango de 0 a 100";
	}

}
