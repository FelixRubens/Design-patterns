package teste;

public class Main {
	
		public static void main(String[] args) {
			
			VectorDraw vec = new VectorDraw();
			System.out.println(" " + vec.getX());
			System.out.println(" " + vec.getHeight());
		
			RasterBox n = new RasterBox();
			System.out.println(" " + n.GetX());
			System.out.println(" " + n.GetHeight());
			
			Coords p = new Coords();
			System.out.println(" " + p.GetX());
			System.out.println(" " + p.GetHeight());
		}
		
}
