package iPhone2007;

public interface instrucoes {
	// Interface para Reprodutor Musical
	interface ReprodutorMusical {
	    void tocarMusica();
	    void pausarMusica();
	    void avancarMusica();
	    void voltarMusica();
	}

	// Interface para Aparelho Telefônico
	interface AparelhoTelefonico {
	    void fazerLigacao(String numero);
	    void receberLigacao(String numero);
	    void enviarMensagem(String mensagem, String destinatario);
	    void receberMensagem(String mensagem, String remetente);
	}

	// Interface para Navegador na Internet
	interface NavegadorInternet {
	    void abrirNavegador();
	    void fecharNavegador();
	    void navegarNaInternet(String URL);
	    void executarBusca(String termo);
	}

}
