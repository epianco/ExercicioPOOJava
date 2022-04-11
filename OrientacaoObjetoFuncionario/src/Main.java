/**
 * 
 */

/**
 * @author vini
 *
 */
public class Main {

	
	public static void main(String[] args) {
		
		FuncionarioAbstract gerente = new Gerente();
		
		gerente.setNome("Paulo");
		gerente.setSalario(1000.00);
		
		System.out.println("Nome: " + gerente.getNome() + "\nSalario: " + gerente.getSalario() + "\nComissão: " + gerente.getComissao());

	}

}
