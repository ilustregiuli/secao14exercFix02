package secao14exercFix02;

public class PessoaFisica extends Contribuinte{
	
	private Double gastosSaude;

	public PessoaFisica () {
		super();
	}
	
	public PessoaFisica(String name, Double rendAnual, Double gastosSaude) {
		super(name,rendAnual);
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calcularImposto() {
		double imposto = 0.0;
		if(this.rendAnual < 20000.0 ) {
			imposto = rendAnual * 0.15;
		} else {
			imposto = rendAnual * 0.25;
		}
		if(gastosSaude != 0) {
			imposto = imposto - (gastosSaude / 2);
		}
		return imposto;
	}

}
