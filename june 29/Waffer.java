class Waffer
{
	int thin;
	int length=5;
	String sweet;
	String shape="Rectangle";
	Waffer()
	{
		System.out.println("I like Waffers..");
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in Waffer..");
		Waffer ref1=new Waffer();
		System.out.println("Thin="+ref1.thin);
		System.out.println("Length="+ref1.length);
		System.out.println("Sweet="+ref1.sweet);
		System.out.println("Shape="+ref1.shape);
	}
}