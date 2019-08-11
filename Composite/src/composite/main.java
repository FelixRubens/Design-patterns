package composite;

public class main {

	public static void main(String[] args) {
		
		congresso a = new congresso();
		
		a.addIndi();
		a.addIndi();
		a.addIndi();
		a.addInst();
		a.addInst();
		
		System.out.println(a.getAssentosTotais());
		
	}

}
