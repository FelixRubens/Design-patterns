package observe;

public class ConcreteSuject extends Sujeito{
	private Object MyData;
	
	public void setData(Object Mydata) {
		this.MyData = Mydata;
		not();
	}
	
	public Object getData() {
		return this.MyData;
	}
}
