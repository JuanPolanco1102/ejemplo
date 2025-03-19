package packPruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.NotaFeraDeRangoException;
import modelo.CalculadoraPromedio;

public class TestCalculadoraPromedio {

	@Test
	public void testCalculoPromedioCorrecto() throws NotaFeraDeRangoException {
		CalculadoraPromedio c1 = new CalculadoraPromedio(80, 60, 70);
		assertEquals(70, c1.calcularPromedio(80, 60, 70));
	}

	@Test
	public void testApruebaAprueba() throws NotaFeraDeRangoException {
		CalculadoraPromedio c1 = new CalculadoraPromedio(80, 60, 70);
		assertEquals("Aprobado", c1.determinarAprobado(70));
	}

	@Test
	public void testApruebaReprueba() throws NotaFeraDeRangoException {
		CalculadoraPromedio c1 = new CalculadoraPromedio(80, 60, 70);
		assertEquals("Reprobado", c1.determinarAprobado(50));
	}

	@Test
	public void testNotasFueraDeRango() throws NotaFeraDeRangoException {
		assertThrows(NotaFeraDeRangoException.class, () -> {
			CalculadoraPromedio c1 = new CalculadoraPromedio(-2, -5, -10);
		});

	}

	@Test
	public void testNotasFueraDeRangoCalcularPromedio() throws NotaFeraDeRangoException {
		CalculadoraPromedio c1 = new CalculadoraPromedio(80, 60, 70);
		assertThrows(NotaFeraDeRangoException.class, () -> {
			c1.calcularPromedio(-3, -5, -10);
		});

	}

}
