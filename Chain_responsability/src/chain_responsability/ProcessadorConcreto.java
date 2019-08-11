package chain_responsability;

public class ProcessadorConcreto implements Processor {
	
	int flag;
	int cont = 0;
	char busca;
	@Override
	public int processarRequisicao(String texto, char find) {
		if(find == busca) {
				for(int i = 0; i < texto.length(); i++) {
					
					if(texto.charAt(i) == find) {
						cont++;
					}
				}
			System.out.println("O numero de '" + find + "' É " + cont);
			return 1;
			}
		
		else {
			return 0;
		}
		
		}
	
	public void setBusca(char busca) {
		this.busca = busca;
	}
		
}
