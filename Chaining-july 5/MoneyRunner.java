class MoneyRunner
{
	public static void main(String[]args)
	{
		System.out.println("Main Method");
		Money money=new Money("India","Rupees","Notes","Commodity Money");
		System.out.println("Country :"+money.country);
		System.out.println("Currency :"+money.currency);
		System.out.println("Denomination :"+money.denomination);
		System.out.println("Type :"+money.type);
	}
}