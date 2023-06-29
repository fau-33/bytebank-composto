public class Conta {
	private double saldo = 100;
	int agencia;
	int numero;
	Cliente titular = new Cliente(); 
	
	
	// métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= saldo) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
	public double pegaSaldo() {
		return this.saldo;
	}
	
	
	
	
	
	
	
	
}