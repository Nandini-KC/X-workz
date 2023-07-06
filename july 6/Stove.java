class Stove
{
	int noOfBurners;
	double price;
	int length;
	String brand;
	String material;
	String color;
	double weight;
	String supplier;
	Stove(int noOfBurners,String brand,String material)
	{
		this.noOfBurners=noOfBurners;
		this.brand=brand;
		this.material=material;
		System.out.println("Running int,String,String in Stove");
	}
}