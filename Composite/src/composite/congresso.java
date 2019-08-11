package composite;

import java.awt.List;
import java.util.ArrayList;

public class congresso{
		public int AssentosTotais;
		public int TotalParticipantes = 0;
		
		private ArrayList<individuo> individuoL = new ArrayList<individuo>();
		private ArrayList<instituicao> instituicaoL = new ArrayList<instituicao>();
		
		/*public void iterador() {
			for(instituicao i : instituicaoL) {
				System.out.println(i.getAssentos()+1);
			}
		
		}
		*/
		
		public int getAssentosTotais() {
			for(individuo i : individuoL) {
				this.TotalParticipantes++;
			}
			
			for(instituicao i : instituicaoL) {
				this.TotalParticipantes += i.getAssentos();
			}
			return this.TotalParticipantes;
		}
		

		public void addIndi() {
			individuo a = new individuo();
			individuoL.add(a);
			
		}
		
		public void addInst() {
			instituicao l = new instituicao();
			individuo a = new individuo();
			individuo c = new individuo();
			l.add(a, c);
			instituicaoL.add(l);
		}
}
