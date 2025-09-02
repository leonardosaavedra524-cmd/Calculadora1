package ar.edu.unlam.dominio;

public class Calculadora {

	public Integer sumar(Integer numeroUno, Integer numeroDos) {
		
		return numeroUno + numeroDos;
	}

	public Integer restar(Integer numeroUno, Integer numeroDos) {
		// TODO Auto-generated method stub
		return numeroUno - numeroDos;
	}

	public Integer Multiplicar(Integer numeroUno, Integer numeroDos) {
		// TODO Auto-generated method stub
		return numeroUno * numeroDos;
	}

	public Double dividir(Integer numeroUno, Integer numeroDos) {
		double resultado = 0;
		if(numeroDos != 0) {
			resultado = numeroUno / numeroDos;
		}
		
		
		return resultado;
	}

}
