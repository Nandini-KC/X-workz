class VegPuff
{
	int price=20;
	int noOfVegetablesUsed;
	String taste;
	String bakeryName="Star Bakery";
	VegPuff()
	{
		System.out.println("I like VegPuffs..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in VegPuff..");
		VegPuff ref1=new VegPuff();
		System.out.println("price="+ref1.price);
		System.out.println("No of vegetables used="+ref1.noOfVegetablesUsed);
		System.out.println("Taste="+ref1.taste);
		System.out.println("Bakery name="+ref1.bakeryName);
	}
}