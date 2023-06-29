class Bun
{
	int noOfBuns=100;
	int cost=20;
	String creamBun;
	String plainBun;
	Bun()
	{
		System.out.println("I like Buns..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Bun..");
		Bun ref1=new Bun();
		System.out.println("No of Buns="+ref1.noOfBuns);
		System.out.println("cost="+ref1.cost);
		System.out.println("CreamBuns="+ref1.creamBun);
		System.out.println(" Plain Buns="+ref1.plainBun);
	}
}