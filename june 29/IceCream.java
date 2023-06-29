class IceCream
{
	String type;
	String nameOfIceCream="Cone ice cream";
	int noOfFlavours=2;
	int manufactureDate;
	IceCream()
	{
		System.out.println("I like IceCreams..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in IceCream..");
		IceCream ref=new IceCream();
		System.out.println("Type="+ref.type);
		System.out.println("Name ="+ref.nameOfIceCream);
		System.out.println("noOfFlavours="+ref.noOfFlavours);
		System.out.println("Manufacture date="+ref.manufactureDate);
	}
}