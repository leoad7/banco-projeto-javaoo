
public class Pix {
	//chaves pix
	private String chaveAleatoria;
	private String email;
	private String cpf;
	private String numero;
	
	//getters
	public String getChaveAleatoria() {
		return this.chaveAleatoria;
	}

	public String getEmail() {
		return this.email;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getNumero() {
		return this.numero;
	}

	//setters
	public void setChaveAleatoria(String chaveAleatoria) {
		this.chaveAleatoria = chaveAleatoria;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void novaChave(int op, String chave) {
		switch (op) {
			case 1:
				this.setChaveAleatoria(chave);
				break;
			case 2:
				this.setCpf(chave);
				break;
			case 3:
				this.setEmail(chave);
				break;
			case 4:
				this.setNumero(chave);
				break;
			default:
				
		}
	}
}
