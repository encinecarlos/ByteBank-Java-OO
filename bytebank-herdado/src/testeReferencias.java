
public class testeReferencias {
	// poderia ter criado um arquivo chamado main.java e feito todos os testes dentro dele
	// pois via de regra uma aplicação tem um e somente um ponto de entrada, então vários aquiuvos com a declaração main acabam mais por atrapalhar do que ajudar
	public static void main(String[] args) {
	// O projeto como um todo esta legal para o teu estagio atual João, só carece de pequenas melhorias mesmo, nada muito complicado, algumas tu vai perceber mais a frente
	// quando estiver mais avançado no aprendizado, e mais um detalhe, procura manter atenção na identação, pois em algumas classes percebi algumas pequenas quebras na mesma ok
	// No mais ta de parabéns ah mais uma coisa procura fazer uso dos construtorres, pois para certas coisas eles podem ser beeeeeem uteis
		
	Gerente gerente1 = new Gerente();
	
	gerente1.setNome("Joao C");
	gerente1.setSalario(5000.0);
	
	programador prog1 = new programador();
	
	prog1.setSalario(2500);
	
	controleBonificacao controle = new controleBonificacao();
	controle.registra(gerente1);
	controle.registra(prog1);
	
	System.out.println(controle.getSoma());
	
	}
}
