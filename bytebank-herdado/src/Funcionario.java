//super class
public abstract class  Funcionario { // uma classe que serve de modelo para as sub class
	//atributos da classe (objeto)
	
	//Um funcionário em essencia é uma pessoa, logo a classe generica correta seria Pessoa e Funcionário herda de Pessoa
	// pois uma pessoa é um funcionario, em resumo cabe criar essa classe pessoa e retirar os atributos nome e cpf daqui
	private String nome;
	private String cpf;
	protected double salario;
	
	//metodo get & set
	// O metodo bonificação não tem sentido estar aqui poderia ficar em uma classe propria
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	//getters e setters de nome e cpf podem ser retirados daqui seguindo a orientação no inicio do arquivo
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
