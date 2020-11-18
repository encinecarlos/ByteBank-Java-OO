
public class testaGerente {

	public static void main(String[] args) {
		// poderia ter criado um arquivo chamado main.java e feito todos os testes dentro dele
		// pois via de regra uma aplicação tem um e somente um ponto de entrada, então vários aquiuvos com a declaração main acabam mais por atrapalhar do que ajudar
		
		Gerente g1 = new Gerente();
		
		g1.setNome("jhon");
		g1.setSalario(5000.0);
		g1.setCpf("333333333-55");
		g1.setSenha(1234);
		
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);

	}

}
