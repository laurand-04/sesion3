package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	String numero;
	String titular;
	Double saldo;
	List<Movimiento> movimientos;
	
	public Cuenta(Double i) {
		this.saldo = i;
		movimientos = new ArrayList<Movimiento>();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double d) {
		// TODO Auto-generated method stub
		this.saldo=saldo+d;
		
	}

	public void retirar(double i) {
		// TODO Auto-generated method stub
		this.saldo=saldo-i;
		if(this.saldo < -500)
			this.saldo = -500.0;
		
	}
	
	
}
