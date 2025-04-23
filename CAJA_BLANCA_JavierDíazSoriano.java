package Examen2T_Díaz_Soriano_Javi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CAJA_BLANCA_JavierDíazSoriano {
	
	//Prubas de cobertura de decisiones
	@Test
	void testDecisionesRealizarPedido() {
		Instituto i = new Instituto(5);
		i.agregarDepartamento("Hola", 5);
		
		assertTrue(i.realizarPedido("Hola", 5),"Verdadero");
		assertFalse(i.realizarPedido("Pablo", 4),"Falso");
	}
	
	//Prubas de cobertura de Caminos Independientes
	@Test
	void testCaminosIndependientesProcesarPedido() {
		Departamento d = new Departamento("Hola", 5);
		
		assertEquals("Es menor al presupuesto.",d.procesarPedido(4));
		assertEquals("Es igual al presupuesto.",d.procesarPedido(5));
		assertEquals("Es mayor al presupuesto.",d.procesarPedido(6));		
	}
	
}
