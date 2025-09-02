package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClaseTest {
	
	private Calculadora calculadora;
	
	@Before
	public void inicializacion() {
	this.calculadora = new Calculadora();	
	}
	
	
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoSumoDosNumerosObtengoLaSumaDeDosNumeros() {
	
	//preparacion
	Integer numeroUno=5;
	Integer numeroDos=4;
	
	
	//ejecucion
	Integer valorObtenido= calculadora.sumar(numeroUno,numeroDos);
	
	
	//verificacion
	Integer valorEsperado = 9;
	assertEquals(valorObtenido, valorEsperado);
		
	}
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoRestoDosNumerosObtengoLaRestaDeDosNumeros() {
	
	//preparacion
	Integer numeroUno=5;
	Integer numeroDos=4;
	
	
	//ejecucion
	Integer valorObtenido= calculadora.restar(numeroUno,numeroDos);
	
	
	//verificacion
	Integer valorEsperado = 1;
	assertEquals(valorObtenido, valorEsperado);
		
	}
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoMultiplicoDosNumerosObtengoLaMultiplicacionDeDosNumeros() {
	
	//preparacion
	Integer numeroUno=5;
	Integer numeroDos=4;
	
	
	//ejecucion
	Integer valorObtenido= calculadora.Multiplicar(numeroUno,numeroDos);
	
	
	//verificacion
	Integer valorEsperado = 20;
	assertEquals(valorObtenido, valorEsperado);
		
	}
	
	@Test
	public void dadoQueExisteUnaCalculadoraCuandoDividoUnNumerosObtengoLaDivisionDelNumero() {
	
	//preparacion
	Integer numeroUno=20;
	Integer numeroDos=4;
	
	
	//ejecucion
	Double valorObtenido= calculadora.dividir(numeroUno,numeroDos);
	
	
	//verificacion
	Double valorEsperado = 5.0;
	assertEquals(valorObtenido, valorEsperado);
		
	}
	
	
	
	
	
	
}