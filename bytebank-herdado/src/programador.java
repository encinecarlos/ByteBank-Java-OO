

public class programador extends Funcionario {
	// poderia ter colocado caracteristicas ou metodos specificos do programador
	// novamente poderia ter usado a classe existente para tratar o calculo da bonificação
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do programador.");
		return super.getBonificacao() + 100;
	}
		
}
