package servidor.validacao;

public class ErroDeValor {

	String campo;
	String mensagem;
	
	public ErroDeValor(String campo, String mensagem) {
		super();
		this.campo = campo;
		this.mensagem = mensagem;
	}
	public String getCampo() {
		return campo;
	}
	public String getMensagem() {
		return mensagem;
	}
}
