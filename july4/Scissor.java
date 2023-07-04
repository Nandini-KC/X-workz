class Scissor
{
	String brand;
	String color;
	String type;
	String usage;
	char size;
	double price;
	String material;
	Scissor(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
		System.out.println("brand="+brand);
		System.out.println("color="+color);
	}
	Scissor(String type)
	{
		this.type=type;
		System.out.println("type="+type);
	}
	Scissor(String brand,String color,String usage)
	{
		this.brand=brand;
		this.color=color;
		this.usage=usage;
		System.out.println("brand="+brand);
		System.out.println("color="+color);
		System.out.println("usage="+usage);
	}
	Scissor(String brand,String color,String usage,char size)
	{
		this.brand=brand;
		this.color=color;
		this.usage=usage;
		this.size=size;
		System.out.println("brand="+brand);
		System.out.println("color="+color);
		System.out.println("usage="+usage);
		System.out.println("Size="+size);
	}
	Scissor(String brand,String color,String usage,char size,double price,String material)
	{
		this.brand=brand;
		this.color=color;
		this.usage=usage;
		this.size=size;
		this.material=material;
		this.price=price;
		System.out.println("brand="+brand);
		System.out.println("color="+color);
		System.out.println("usage="+usage);
		System.out.println("Size="+size);
		System.out.println("material="+material);
		System.out.println("price="+price);
	}
	Scissor(String brand,String color,String usage,char size,double price)
	{
		this.brand=brand;
		this.color=color;
		this.usage=usage;
		this.price=price;
		System.out.println("brand="+brand);
		System.out.println("color="+color);
		System.out.println("usage="+usage);
		System.out.println("price="+price);
	}
	Scissor()
	{
		System.out.println("Scissor is sharp");
	}
	
}