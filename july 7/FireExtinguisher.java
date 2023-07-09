class FireExtinguisher
{
	String bodyMaterial;
	String brand;
	String rangeOfJet;
	double weight;
	String typeOfFireExtinguisher;
	FireExtinguisher(String bodyMaterial,String brand,String rangeOfJet,double weight,String typeOfFireExtinguisher)
	{
		this.bodyMaterial=bodyMaterial;
		this.brand=brand;
		this.rangeOfJet=rangeOfJet;
		this.weight=weight;
		this.typeOfFireExtinguisher=typeOfFireExtinguisher;
	}
	void printInstanceVariable()
	{
		System.out.println("bodyMaterial="+bodyMaterial);
		System.out.println("Brand="+brand);
		System.out.println("RangeOfJet="+rangeOfJet);
		System.out.println("Weight="+weight);
		System.out.println("TypeOfFireExtinguisher="+typeOfFireExtinguisher);
	}
}