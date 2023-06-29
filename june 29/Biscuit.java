class Biscuit
{
	int expireDate;
	String shape="square";
	String thin;
	String flavour="orange";
	Biscuit()
	{
		System.out.println("I like Biscuits..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Biscuit..");
		Biscuit ref1=new Biscuit();
		System.out.println("Expiredate="+ref1.expireDate);
		System.out.println("Shape="+ref1.shape);
		System.out.println("Thin="+ref1.thin);
		System.out.println("Flavour="+ref1.flavour);
	}
}