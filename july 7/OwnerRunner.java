class OwnerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in OwnerRunner");
		Owner owner=new Owner("Rakesh","Banglore",40,2000000,"Degree");
		owner.print();
		System.out.println("Updated variables");
		owner.ownerName="Vasu";
		owner.place="Chittoor";
		owner.age=45;
		owner.investment=2500000;
		owner.qualification="Btech";
		owner.print();
	}
}