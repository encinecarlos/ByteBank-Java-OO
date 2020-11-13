
public class testeReferencias {
	
	public static void main(String[] args) {
		
	
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