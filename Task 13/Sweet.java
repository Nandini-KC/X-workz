class Sweet
{
	String color="Yellow";
	int price=50;
	String shape;
	String taste;
	Sweet()
	{
		System.out.println("I like Sweets..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Sweet..");
		Sweet sweet=new Sweet();
		System.out.println("Color="+sweet.color);
		System.out.println("Price="+sweet.price);
		System.out.println("Shape="+sweet.shape);
		System.out.println("Taste="+sweet.taste);
	}
}