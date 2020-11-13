//super class
public abstract class  Funcionario { // uma classe que serve de modelo para as sub class
	//atributos da classe (objeto)
	private String nome;
	private String cpf;
	protected double salario;
	
	//metodo get & set
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
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
