class Kabab
{
	String name;
	double price;
	String hotelName;
	int noOfPieces;
	boolean takeAway;
	Kabab()
	{
		System.out.println("Kabab is very tasty");
	}
	Kabab(String name)
	{
		this.name=name;
		System.out.println("name="+name);
	}
	Kabab(String name,double price)
	{
		this.name=name;
		this.price=price;
		System.out.println("name="+name);
		System.out.println("price="+price);
	}
	Kabab(String name,double price,String hotelName)
	{
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		System.out.println("name="+name);
		System.out.println("price="+price);
		System.out.println("hotelName="+hotelName);
	}
	Kabab(String name,double price,int noOfPieces,boolean takeAway)
	{
		this.name=name;
		this.price=price;
		this.noOfPieces=noOfPieces;
		this.takeAway=takeAway;
		System.out.println("name="+name);
		System.out.println("price="+price);
		System.out.println("noOfPieces="+noOfPieces);
		System.out.println("takeAway="+takeAway);

	}
}