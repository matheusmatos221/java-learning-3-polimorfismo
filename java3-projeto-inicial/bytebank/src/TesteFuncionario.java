
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario matheus = new Funcionario();
		matheus.setNome("Matheus Matos");
		matheus.setCpf("22211100013");
		matheus.setSalario(10000.00);
		
		System.out.println(matheus.getNome());
		System.out.println(matheus.getBonificacao());
		
	}
}
