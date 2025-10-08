package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	String numero;
	String titular;
	Double saldo;
	List<Movimiento> movimientos;
	public enum Signo {D, H};
	
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
		movimientos.add(new Movimiento(d, false, "Reintegro"));
		
	}

	public void retirar(double i) {
		// TODO Auto-generated method stub
		if(this.saldo-i >= -500) {
			this.saldo=saldo-i;
			movimientos.add(new Movimiento(i, true, "Reintegro"));
		}
		else {
			System.out.println("Error al hacer el reintegro de " + i + ", su saldo es de " + saldo);
		}
	}
	
	
}
