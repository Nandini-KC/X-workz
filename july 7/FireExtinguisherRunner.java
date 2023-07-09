class FireExtinguisherRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in FireExtinguisherRunner");
		FireExtinguisher ref=new FireExtinguisher("Mild Steel","Armex Pro","2,3,4 mtr",5,"CO2 Based");
		ref.printInstanceVariable();
		System.out.println("Updated variables");
		ref.bodyMaterial="SS";
		ref.brand="Safe Pro";
		ref.rangeOfJet="4,5,6 mtr";
		ref.weight=10;
		ref.typeOfFireExtinguisher="Fire Suppression Systems";
		ref.printInstanceVariable();
	}
}