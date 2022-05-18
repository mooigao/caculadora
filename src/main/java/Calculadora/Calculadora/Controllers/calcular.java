package Calculadora.Calculadora.Controllers;

public class calcular {
	private int num1;
	private int num2;
	private char operador;
	private float resultado;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public char getOperador() {
		return operador;
	}
	public void setOperador(char operador) {
		this.operador = operador;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	public void Calcular() 
	{
		switch (operador) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		default:
			break;
		}
	}
}
