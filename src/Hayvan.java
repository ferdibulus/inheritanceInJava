
public class Hayvan {

	 private String name ;
	 private int weight;
	 private int height;
	 private int foot;
	 public Hayvan(String name, int weight, int height, int foot) {
		this.setName(name);
		this.setWeight(weight);
		this.setHeight(height);
		this.setFoot(foot);
	}
	public void yemekYe()
	{
		System.out.println("Hayvan suanda yemek yiyor");
	}
	
	public void haraketeGec(int speed) {
		System.out.println("Hayvan " + speed + " hiz ile hareket ediyor");
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getWeight() {
		return weight;
	}
	private void setWeight(int weight) {
		this.weight = weight;
	}
	private int getHeight() {
		return height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	private int getFoot() {
		return foot;
	}
	private void setFoot(int foot) {
		this.foot = foot;
	}
}
