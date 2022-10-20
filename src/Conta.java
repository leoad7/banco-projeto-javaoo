
public class Conta {
	private int agencia = 1;
	private int numero = 1111;
	private double saldo = 0;
	private Pessoa pessoa;
	private Pix pix;

	public Conta(int agencia, int numero, double saldo, Pessoa pessoa, Pix pix){
		this.agencia = agencia;
		this.numero++;
		this.saldo = saldo;
		this.pessoa = pessoa;
		this.pix = pix;
	}
	
	// getters e setters classe Pix
	public Pix getPix() {
		return pix;
	}

	public void setPix(Pix pix) {
		this.pix = pix;
	}

	// getters e setters classe Pessoa
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	// getters e setters classe Conta
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//metodos para rotinas financeiras
	public boolean saca(double valor) {
		if (saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void deposita(double valor) {
			this.saldo += valor;
	}

	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}