
public class Kopek extends Hayvan {
	private int teeth_number;

	public Kopek(String name, int weight, int height, int foot, int teeth_number) {
		super(name, weight, height, foot);
		this.setTeeth_number(teeth_number);
	}

	private int getTeeth_number() {
		return teeth_number;
	}

	private void setTeeth_number(int teeth_number) {
		this.teeth_number = teeth_number;
	}
	public void haraketeGec(int speed) {
		System.out.println("Kopek " + speed + " hiz ile hareket ediyor");
	}
	
	public void Kos(int speed) {
		System.out.println("Kopek kosuyor");
		super.haraketeGec(7);
	}
	
	
}
