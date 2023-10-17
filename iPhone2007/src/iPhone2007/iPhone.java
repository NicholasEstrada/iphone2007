package iPhone2007;


public class iPhone {
	String nome_dono;
	String numero_telefone;
	int dias_uso;
	String data_lancamento;
	
	public iPhone(String nome_dono, String numero_telefone, int dias_uso, String data_lancamento) {
		// TODO Auto-generated constructor stub
		String nomeDono = nome_dono;
		String numeroTelefone = numero_telefone;
		int diasUso = dias_uso;
		String dataLancamento = data_lancamento;
	}
	
	public static void main(String ars[]) {
		ouvirMusica ouvir = new ouvirMusica("Marcos", "47998765489", 234, "12/02/2021");
		
		ouvir.tocarMusica();
		ouvir.avancarMusica();
		
		acessaInternet acessa = new acessaInternet("Marcos", "47998765489", 234, "12/02/2021");
		acessa.abrirNavegador();
		acessa.navegarNaInternet("google.com");
		acessa.executarBusca("Como ser dev expert");
		acessa.fecharNavegador();
		
		
		iniciaLigacao ligacao = new iniciaLigacao("Marcos", "47998765489", 234, "12/02/2021");
		ligacao.enviarMensagem("Confirmado a reuniao de amanha?", "47996784567");
		ligacao.fazerLigacao("1134568743");
		ligacao.receberMensagem("Confirmado sim!", "47996784567");
		
	}

}


