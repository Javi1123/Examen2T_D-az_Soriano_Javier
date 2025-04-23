package Examen2T_Díaz_Soriano_Javi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class INTEGRACION_JavierDíazSoriano {
	
	//Integracion
	@Test
	public void testRealizarPedidos() {
		Instituto i = new Instituto(5);
		
		assertTrue(i.realizarPedido("Hola", 5));
	}
	
	//He hecho lo que podia no he entendido mucho el tema :)
}
