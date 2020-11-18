
public class controleBonificacao {
	// classe esta ok para inicio, mas da para fazer melhor
	// mas não vou cobrar a melhoria agora, pois lá na frente tu vai perceber essa necessidade de melhoria e saber como fazer
	// só vou fazer um adendo para que essa classe seja usada nas demais implementações
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


