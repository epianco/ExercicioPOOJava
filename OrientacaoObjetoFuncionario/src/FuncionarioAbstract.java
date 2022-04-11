
public class FuncionarioAbstract implements IFuncionario {

	private String nome;
	
	private Double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double getComissao() {
		return getSalario() * 0.05d;
	}

	@Override
	public Double getSalario() {
		// TODO Auto-generated method stub
		return null;
	}
}
