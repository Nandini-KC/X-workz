class KababRunner
{
	public static void main(String[] args)
	{
		Kabab kabab=new Kabab();
		System.out.println(kabab.name);
		System.out.println(kabab.price);
		System.out.println(kabab.hotelName);
		System.out.println(kabab.noOfPieces);
		System.out.println(kabab.takeAway);
		Kabab kabab1=new Kabab("chicken");
		System.out.println(kabab1.name);
		System.out.println(kabab1.price);
		System.out.println(kabab1.hotelName);
		System.out.println(kabab1.noOfPieces);
		System.out.println(kabab1.takeAway);
		Kabab kabab2=new Kabab("Chicken",100);
		System.out.println(kabab2.name);
		System.out.println(kabab2.price);
		System.out.println(kabab2.hotelName);
		System.out.println(kabab2.noOfPieces);
		System.out.println(kabab2.takeAway);
		Kabab kabab3=new Kabab("Fish",200,"Virat center");
		System.out.println(kabab3.name);
		System.out.println(kabab3.price);
		System.out.println(kabab3.hotelName);
		System.out.println(kabab3.noOfPieces);
		System.out.println(kabab3.takeAway);
		Kabab kabab4=new Kabab("Chicken",250,15,true);
		System.out.println(kabab4.name);
		System.out.println(kabab4.price);
		System.out.println(kabab4.hotelName);
		System.out.println(kabab4.noOfPieces);
		System.out.println(kabab4.takeAway);
	}
}