class Bread
{
	int expireDate;
	int noOfItemsUsed=3;
	String taste;
	String bakery="Banglore Bakery";
	Bread()
	{
		System.out.println("Breads are healthy..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Bread..");
		Bread ref1=new Bread();
		System.out.println("expireDate="+ref1.expireDate);
		System.out.println("No of items used="+ref1.noOfItemsUsed);
		System.out.println("Taste="+ref1.taste);
		System.out.println("Bakery name="+ref1.bakery);
	}
}