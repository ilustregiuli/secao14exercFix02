package secao14exercFix02;

public abstract class Contribuinte {

	protected String nome;
	protected Double rendAnual;
	protected Double impostPago;
	
	public Contribuinte() {
		
	}
	
	public Contribuinte(String nome, Double rendAnual, Double impostPago) {
		this.nome = nome;
		this.rendAnual = rendAnual;
		this.impostPago = impostPago;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendAnual() {
		return rendAnual;
	}

	public void setRendAnual(Double rendAnual) {
		this.rendAnual = rendAnual;
	}

	public Double getImpostPago() {
		return impostPago;
	}

	public void setImpostPago(Double impostPago) {
		this.impostPago = impostPago;
	}
	
	public abstract Double calcularImposto();
	
	
}
