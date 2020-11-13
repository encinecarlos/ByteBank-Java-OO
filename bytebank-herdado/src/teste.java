
public class teste {

	public static void main(String[] args) {
		//variavel de referencia + construtor e tipo do objeto a ser criado
		Funcionario joao = new Funcionario();
		
		//populando
		joao.setNome("Joao Gama");
		joao.setCpf("222-222-222-55");
		joao.setSalario(3500.00);
		
		// testando metodo GET e Set
		System.out.println(joao.getNome());
		System.out.println(joao.getBonificacao());
		System.out.println(joao.getCpf());

	}

}
