package chat;

public interface chatMediator {
	public void sendMessage(String msg, Usuario user);
	
	public void addUser(Usuario user);
}
