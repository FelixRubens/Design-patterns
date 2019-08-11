package observe;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	ArrayList<instituto> InstList = new ArrayList<instituto>();
	
	Scanner ler = new Scanner(System.in);
	
	int i;
	String palavra;
	int q;
	
	for(i = 0; i < 4; i++) {
		instituto p = new instituto();
		palavra = ler.next();
		p.setNome(palavra);
		q = ler.nextInt();
		p.setNumero(q);
		
		InstList.add(p);
	}
	
	for(instituto k : InstList) {
		System.out.println(k.getNome());
	}
	
	}

}
