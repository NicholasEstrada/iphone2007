package iPhone2007;


import iPhone2007.instrucoes.ReprodutorMusical;

public class ouvirMusica extends iPhone implements ReprodutorMusical{

	public ouvirMusica(String nome_dono, String numero_telefone, int dias_uso, String string) {
		super(nome_dono, numero_telefone, dias_uso, string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocarMusica() {
		System.out.println(" Começa a tocar musica ");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println(" Pausar musica ");
		
	}

	@Override
	public void avancarMusica() {
		System.out.println(" Avançar musica ");
		
	}

	@Override
	public void voltarMusica() {
		System.out.println(" Voltar musica ");
		
	}

}
