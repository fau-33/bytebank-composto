
public class TestaBanco {
	public static void main(String[] args) {
		Cliente flavio = new Cliente();
		flavio.nome = "Flávio Félix";
		flavio.cpf = "333.333.333-33";
		flavio.profissao = "programador";
		
		Conta contaDoFlavio = new Conta();
		contaDoFlavio.deposita(100);
		
		contaDoFlavio.titular = flavio;
		System.out.println(contaDoFlavio.titular.nome);
		System.out.println(contaDoFlavio.titular);
	}
}
