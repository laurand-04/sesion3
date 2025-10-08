package pkg;

public class Movimiento {
	public enum Signo {D, H};
	
	private double importe;
	private Signo signo;
	private String detalle;
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Signo getSigno() {
		return signo;
	}
	public void setSigno(Signo signo) {
		this.signo = signo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
