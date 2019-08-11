package teste;

public class RasterBox {
	private Coords topLeft, bottomRight;
	
	Adpter a = new Adpter();
	
	public int GetX() {
		return a.getX();
	}
	
	public int GetHeight() {
		return a.getHeight();
	}
	
	public Coords getTopLeft() {
		return this.topLeft;
	}
	
	public Coords getBottomRight() {
		return this.bottomRight;
	}
}
