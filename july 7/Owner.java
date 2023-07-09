class Owner
{
	String ownerName;
	String place;
	int age;
	double investment;
	String qualification;
	Owner(String ownerName,String place,int age,double investment,String qualification)
	{
		this.ownerName=ownerName;
		this.place=place;
		this.age=age;
		this.investment=investment;
		this.qualification=qualification;
	}
	void print()
	{
		System.out.println("ownerName="+ownerName);
		System.out.println("place="+place);
		System.out.println("age="+age);
		System.out.println("investment="+investment);
		System.out.println("qualification="+qualification);
	}
}