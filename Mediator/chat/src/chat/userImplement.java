package chat;

public class userImplement extends Usuario {

	
	public userImplement(chatMediator chat, String nome) {
			super(chat, nome);
	}
	
	@Override
	public void enviar(String mensagem) {
		System.out.println(this.nome + ": Enviando mensagem =" + mensagem);
		chat.sendMessage(mensagem, this);
		
	}

	@Override
	public void receber(String mensagem) {
		System.out.println(this.nome + ":Mensagem Recebida:" + mensagem);
	}
	
}
