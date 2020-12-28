package secao14exercFix02;

public class PessoaJuridica extends Contribuinte{
	
	private Integer numFunc;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double rendAnual, Integer numFunc) {
		super(name, rendAnual);
		this.numFunc = numFunc;
	}


	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public Double calcularImposto() {
		double imposto = 0.0;
		if(this.numFunc > 10 ) {
			imposto = rendAnual * 0.14;
		} else {
			imposto = rendAnual * 0.16;
		}
		return imposto;
	}
	

}
