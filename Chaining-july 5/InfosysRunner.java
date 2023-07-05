class InfosysRunner
{
	public static void main(String[] args)
	{
		Infosys infosys=new Infosys("Narayana Murthy","Sudha Murthy",1981,34300000);
		System.out.println("Founder name="+infosys.founderName);
		System.out.println("Founder wife name="+infosys.founderWifeName);
		System.out.println("Founded year="+infosys.founded);
		System.out.println("No of employees="+infosys.noOfEmployees);
	}
}