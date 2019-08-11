package chain_responsability;


import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	String texto;
	char find;
	Scanner ler = new Scanner(System.in);
	
	texto = ler.nextLine();
	int flag;
	
	ArrayList<ProcessadorConcreto>chain = new ArrayList<ProcessadorConcreto>();
	
	ProcessadorConcreto p1 = new ProcessadorConcreto();
	p1.setBusca(' ');
	chain.add(p1);
	
	ProcessadorConcreto p2 = new ProcessadorConcreto();
	p2.setBusca('a');
	chain.add(p2);
	
	ProcessadorConcreto p3 = new ProcessadorConcreto();
	p3.setBusca('.');
	chain.add(p3);
	int p = 0;
	
		while(p < 3) {
			find = ler.next().charAt(0);
			for(ProcessadorConcreto i : chain) {
				flag = i.processarRequisicao(texto, find);
				if(flag == 1) {
					break;
				}
				}
		
			}
			find = (Character) null;
			p++;
		}

}
