package iPhone2007;

import iPhone2007.instrucoes.NavegadorInternet;

public class acessaInternet extends iPhone implements NavegadorInternet{

	public acessaInternet(String nome_dono, String numero_telefone, int dias_uso, String data_lancamento) {
		super(nome_dono, numero_telefone, dias_uso, data_lancamento);
	}

	@Override
	public void abrirNavegador() {
		System.out.println(" Abre o nevegador ");
		
	}

	@Override
	public void fecharNavegador() {
		System.out.println(" Fecha o navegador ");
		
	}

	@Override
	public void navegarNaInternet(String URL) {
		System.out.println(" Abre a URl solicitada no endereço: " + URL);
		
	}

	@Override
	public void executarBusca(String termo) {
		System.out.println(" Busca pela palavra: " + termo);
		
	}

}
