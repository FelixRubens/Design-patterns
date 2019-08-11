package chat;

public abstract class Usuario {
	protected chatMediator chat;
	protected String nome;
	
	public Usuario(chatMediator chat, String nome) {
		this.chat = chat;
		this.nome = nome;
	}
	
	public abstract void enviar(String mensagem);
	public abstract void receber(String mensagem);
}
