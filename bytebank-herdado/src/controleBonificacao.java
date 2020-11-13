
public class controleBonificacao {
	
	private double soma;
	
	//metodo
	public void registra (Funcionario func) {//referencia generica sempre sera chamado o metodo de cada objeto
		double boni = func.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
}


