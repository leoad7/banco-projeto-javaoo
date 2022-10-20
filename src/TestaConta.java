
public class TestaConta {
	public static void main(String[] args) {
		// nova conta
		Pessoa novapessoa = new Pessoa("Jose", "222.222.222-22", "rua fulano");
		Pix novopix = new Pix();
		Conta novaconta = new Conta(123, 1234, 0, novapessoa, novopix);
		
		//nova conta2
		Pessoa novapessoa2 = new Pessoa("Isabela", "222.222.222-22", "rua sicrano");
		Pix novopix2 = new Pix();
		Conta novaconta2 = new Conta(344, 3235, 0, novapessoa2, novopix2);
		
		//testar transferencia
		novaconta.deposita(20.0);
		novaconta.transfere(10.0, novaconta2);
		System.out.println("saldo da conta novaconta: " + novaconta.getSaldo());
		System.out.println("saldo da conta novaconta2: " + novaconta2.getSaldo());

		//testar cadastro chave pix
		// 1 - chave aleatoria; 2 - cpf; 3 - email; 4 - numeroTel
		novaconta.getPix().novaChave(3, "admin@local.host");
		novaconta2.getPix().novaChave(4, "839999999");
		
		System.out.println();
		System.out.println("Chaves pix e-mail novaconta: " + novaconta.getPix().getEmail());
		System.out.println("Chaves pix novaconta2: " + novaconta2.getPix().getNumero());
	}
	
	
}
