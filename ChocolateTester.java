package Const_Static;

class Chocolate{
	int barCode;
	String name;
	double weight;
	double cost;
	
	Chocolate(){
		barCode=101;
		name="Cadbury";
		weight=12;
		cost=10;
	}
	
	Chocolate( int barCode, String name, double weight, double cost){
		this.barCode=barCode;
		this.name=name;
		this.weight=weight;
		this.cost=cost;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}

public class ChocolateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of chocolate
		Chocolate ch=new Chocolate(101,"Cadbury",12,10);
		
		//Use getter methods to display the values
		System.out.println(ch.getBarCode());
		System.out.println(ch.getName());
		System.out.println(ch.getWeight());
		System.out.println(ch.getCost());
		System.out.println();
		
		//Use setter methods to modify the values
		ch.setBarCode(102);
		ch.setName("Hershey's");
		ch.setWeight(24);
		ch.setCost(50);
		
		//Use getter methods to display the modified values
		System.out.println(ch.getBarCode());
		System.out.println(ch.getName());
		System.out.println(ch.getWeight());
		System.out.println(ch.getCost());

	}

}
