class Plate
{
	int price;
	String material;
	String purpose;
	String shape;
	double weight;
	String type;
	String color;
	Plate(String material,int price,String color,String shape)
	{
		this.material=material;
		this.price=price;
		this.color=color;
		this.shape=shape;
		System.out.println("Running String,int,String,String in Pot");
	}
}