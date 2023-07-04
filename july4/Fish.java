class Fish
{
	String name;
	String type;
	double price;
	String location;
	Fish()
	{
		System.out.println("Running constructor");
	}
	Fish(String name,String type)
	{
		this.name=name;
		this.type=type;
		System.out.println("Name ="+name);
		System.out.println("Type ="+type);
	}
	Fish(double price)
	{
		this.price=price;
		System.out.println("price ="+price);
	}
	Fish(String location)
	{
		this.location=location;
		System.out.println("location="+location);
	}
}