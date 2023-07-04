class Basket
{
	String color;
	int capacity;
	String size;
	Basket(String color)
	{
		this.color=color;
		System.out.println("Color="+color);
	}
	Basket(String color,int capacity)
	{
		this.color=color;
		this.capacity=capacity;
		System.out.println("color="+color);
		System.out.println("capacity="+capacity);
	}
	Basket(String size,String color,int capacity)
	{
		this.size=size;
		this.color=color;
		this.capacity=capacity;
		System.out.println("Size="+size);
		System.out.println("color="+color);
		System.out.println("capacity="+capacity);
	}
}