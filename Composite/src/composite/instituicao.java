package composite;

import java.awt.List;
import java.util.ArrayList;

public class instituicao{
	
	int assentos;
	
	
	private ArrayList<individuo> individuoList = new ArrayList<individuo>();
	
	public void add(individuo a, individuo b) {
		individuoList.add(a);
		individuoList.add(b);
	}
	
	public int getAssentos() {
			for(individuo i : individuoList) {
				assentos ++;
			}
		return this.assentos;
	}
}
