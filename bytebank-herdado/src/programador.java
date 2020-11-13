

public class programador extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do programador.");
		return super.getBonificacao() + 100;
	}
		
}
