
//Heranca da classe funcionario tornando-a subclass da funcionario
public class Gerente extends Funcionario {
	
	//encapsulamento
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
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do gerente");
		return super.getBonificacao() + super.salario;
	}
	
	
}
