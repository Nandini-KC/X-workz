class OilRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in OilRunner");
		Oil ref=new Oil("Bharat petroleum",1000,500,"Crude Oil","Bike");
		ref.printInstanceVariable();
		System.out.println("Updated variables");
		ref.brand="Gulf";
		ref.cost=1500;
		ref.quantity=450;
		ref.oilName="Engine oil";
		ref.vehicleName="Lorry";
		ref.printInstanceVariable();
	}
}