class Pot
{
	String purpose;
	int cost;
	int capacity;
	double weight;
	int size;
	String material;
	String color;
	Pot(String purpose,int capacity,String color,String material)
	{
		this.purpose=purpose;
		this.capacity=capacity;
		this.color=color;
		this.material=material;
		System.out.println("Running String,int,String,String in Pot");
	}
}