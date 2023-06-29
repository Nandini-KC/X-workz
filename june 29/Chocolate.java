class Chocolate
{
	String companyName="Nestle";
	int price=50;
	String flavour;
	int expireDate;
	Chocolate()
	{
		System.out.println("I like Chocolates..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Chocolate..");
		Chocolate ref1=new Chocolate();
		System.out.println("CompanyName="+ref1.companyName);
		System.out.println("Price="+ref1.price);
		System.out.println("Flavour="+ref1.flavour);
		System.out.println("ExpireDate="+ref1.expireDate);
	}
}