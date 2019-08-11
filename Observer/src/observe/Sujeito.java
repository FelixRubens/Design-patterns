package observe;

import java.util.ArrayList;

public abstract class Sujeito{
		
	private ArrayList<observadores> ObserverList = new ArrayList<observadores>();
	
		public void add(observadores o) {
			ObserverList.add(o);
		}
		
		public void not() {
			for(observadores i : ObserverList) {
				i.atualizar();
			}
		}
}
