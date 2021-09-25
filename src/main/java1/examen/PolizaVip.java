package examen;

public class PolizaVip extends Poliza {

	private String nombre;
	private String descripcion;
	private int vigencia;
	private String codigo;
	private int valorPoliza;
	private String beneficio;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getVigencia() {
		return vigencia;
	}
	public void setVigencia(int vigencia) {
		this.vigencia = vigencia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getValorPoliza() {
		return valorPoliza;
	}
	public void setValorPoliza(int valorPoliza) {
		this.valorPoliza = valorPoliza;
	}
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	
	
	
}
