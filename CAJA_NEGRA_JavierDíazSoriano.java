package Examen2T_Díaz_Soriano_Javi;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CAJA_NEGRA_JavierDíazSoriano {
	
	//Pruebas límites 
	@Test
	public void testMenorAlMonton() {
		Departamento d = new Departamento("Hola", 3);
		boolean resultado = d.procesarPedido(2);
		assertFalse(resultado);
	}
	
	@Test
	public void testMayorAlMonton() {
		Departamento d = new Departamento("Adios", 2);
		boolean resultado = d.procesarPedido(3);
		assertTrue(resultado);
	}
	
	//Pruebas equivalencia 
	@Test
	public void testRealizarPedidoValido() {
		Instituto i = new Instituto(5);
		i.agregarDepartamento("Hola", 5);
		boolean resultado = i.realizarPedido("Hola", 5);
		assertTrue(resultado); //Si el nombre coincide no dira nada.
	}
	
	@Test
	public void testRealizarPedidoInvalido() {
		Instituto i = new Instituto(5);
		i.agregarDepartamento("Hola", 5);
		boolean resultado = i.realizarPedido("Pedro", 3);
		assertFalse(resultado,"El nombre no coincide con el del departamento");
	}
}
