package chat;

import java.util.ArrayList;

public class chatImplement implements chatMediator {
	
	private ArrayList<Usuario> users = new ArrayList<Usuario>();
	
	
	@Override
	public void sendMessage(String msg, Usuario user) {
		for(Usuario i : this.users) {
			if(i != user) {
				i.receber(msg);
			}
		}
	}

	@Override
	public void addUser(Usuario user) {
		this.users.add(user);
	}

}
