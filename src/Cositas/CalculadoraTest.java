package Cositas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSuma() {
		double valorEsperado = 30;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void testResta() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void testMultiplica() {
		double valorEsperado = 200;
		Calculadora calcu = new Calculadora(20, 50);
		double resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, 0, "Fallo en la multiplicaci�n: ");
	}
	
	@Test
	public void testDivide() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20, 0);
		double resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void testExcepcion() {
		try {
			Calculadora calcu = new Calculadora(20, 0);
			double resultado = calcu.divide();
			fail("FALLO, Deberia haber lanzado la excepci�n");
		} catch (ArithmeticException e) {
			// PRUEBA satisfactoria
		}
	}
	
	@Test
	public void testDivide0() {
		Calculadora calcu = new Calculadora(20, 0);
		Exception exception = assertThrows(ArithmeticException.class, () ->
		                     calcu.divide0());
		assertEquals("Divisi�n por 0", exception.getMessage());
	}

}
