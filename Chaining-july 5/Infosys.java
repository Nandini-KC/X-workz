class Infosys
{
	String founderName;
	String founderWifeName;
	int founded;
	long noOfEmployees;
	Infosys(String founderName)
	{
		this.founderName=founderName;
		System.out.println("Running String Constructor in Infosys");
	}
	Infosys(String founderName,String founderWifeName)
	{
		this(founderName);
		System.out.println("Running String,String constructor in Infosys");
		this.founderWifeName=founderWifeName;
	}
	Infosys()
	{

		System.out.println("Running Constructor in Infosys");
	}
	Infosys(String founderName,String founderWifeName,int founded,long noOfEmployees)
	{
		this(founderName,founderWifeName);
		this.founded=founded;
		this.noOfEmployees=noOfEmployees;
		System.out.println("Running String,String,int,long constructor in Infosys");
		
	}
	
}