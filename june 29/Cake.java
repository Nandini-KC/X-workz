class Cake
{
	String flavour="Pineapple";
	int price=500;
	int noOfKgs;
	String sweet;
	Cake()
	{
		System.out.println("I love Pineapple cake");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Cake..");
		Cake cake=new Cake();
		System.out.println("Flavour="+cake.flavour);
		System.out.println("Price="+cake.price);
		System.out.println("noOfKgs="+cake.noOfKgs);
		System.out.println("sweet="+cake.sweet);
	}
}