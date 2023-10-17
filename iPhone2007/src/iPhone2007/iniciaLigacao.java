package iPhone2007;


import iPhone2007.instrucoes.AparelhoTelefonico;

public class iniciaLigacao extends iPhone implements AparelhoTelefonico{

	public iniciaLigacao(String nome_dono, String numero_telefone, int dias_uso, String data_lancamento) {
		super(nome_dono, numero_telefone, dias_uso, data_lancamento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fazerLigacao(String numero) {
		System.out.println(" Inicia ligação ");
		
	}

	@Override
	public void receberLigacao(String numero) {
		System.out.println(" Intercepta ligação ");
		
	}

	@Override
	public void enviarMensagem(String mensagem, String destinatario) {
		System.out.println(" Envia a mensagem: " + mensagem + ". Para: " + destinatario);
		
	}

	@Override
	public void receberMensagem(String mensagem, String remetente) {
		System.out.println(" Recebe a mensagem: " + mensagem + ". De: " + remetente);
		
	}

}
