
public class testaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("jhon");
		g1.setSalario(5000.0);
		g1.setCpf("333333333-55");
		g1.setSenha(1234);
		
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);

	}

}
