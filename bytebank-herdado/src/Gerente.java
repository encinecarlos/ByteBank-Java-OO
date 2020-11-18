
//Heranca da classe funcionario tornando-a subclass da funcionario
public class Gerente extends Funcionario {
	
	//encapsulamento
	
	// encapsulkamento esta ok, aqui vem uma dica, a parte referente a autenticação pode ser colocada em classe propria
	private int senha;
	
	//metodo espesifico da classe gerente
	public void setSenha(int senha){
		this.senha = senha;
	}
	//metodo espesifico da classe gerente
	public boolean autentica(int senha) {
		if(this.senha == senha) {
		return true;
		} else {
		return false;
		}
	}
	
	//Heranca e , puxando da super class atraves do SUPER um metodo
	// aqui esta correto, uma vez que o funcionario tem bonificação e tu pode alterar o comportamento desse getter aqui, mas como disse antes
	// a bonificação pode ser tratada em classe propria e instanciada, não havendo necessidade da herança
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do gerente");
		return super.getBonificacao() + super.salario;
	}
	
	
}
