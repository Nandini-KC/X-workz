class Candy
{
	int cost=8;
	int noOfCandies;
	String taste;
	String candyName="Exclairs";
	Candy()
	{
		System.out.println("There are many candies");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Candy..");
		Candy choco=new Candy();
		System.out.println("cost="+choco.cost);
		System.out.println("noOfCandies="+choco.noOfCandies);
		System.out.println("Taste="+choco.taste);
		System.out.println("candy name="+choco.candyName);
	}
}