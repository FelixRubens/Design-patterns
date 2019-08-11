package chat;

public class cliente {

	public static void main(String[] args) {
		chatImplement chat = new chatImplement();
		
		userImplement douglas = new userImplement(chat, "douglas");
		userImplement bruno = new userImplement(chat, "bruno");
		userImplement rubens = new userImplement(chat, "rubens");
		
		chat.addUser(douglas);
		chat.addUser(bruno);
		chat.addUser(rubens);
		
		rubens.enviar("eae galera");
		
		System.out.println("\n\n");
		
		userImplement caio = new userImplement(chat, "caio");
		chat.addUser(caio);
		
		caio.enviar("eae galera");
	}

}
