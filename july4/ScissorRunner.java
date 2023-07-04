class ScissorRunner
{
	public static void main(String[] args)
	{
		Scissor scissor=new Scissor("Titan","Silver");
		System.out.println(scissor.brand);
		System.out.println(scissor.color);
		System.out.println(scissor.type);
		System.out.println(scissor.usage);
		System.out.println(scissor.size);
		System.out.println(scissor.price);
		System.out.println(scissor.material);
		Scissor scissor1=new Scissor("Chain");
		System.out.println(scissor1.brand);
		System.out.println(scissor1.color);
		System.out.println(scissor1.type);
		System.out.println(scissor1.usage);
		System.out.println(scissor1.size);
		System.out.println(scissor1.price);
		System.out.println(scissor1.material);
		Scissor scissor2=new Scissor("Sonata","Gold","Good");
		System.out.println(scissor2.brand);
		System.out.println(scissor2.color);
		System.out.println(scissor2.type);
		System.out.println(scissor2.usage);
		System.out.println(scissor2.size);
		System.out.println(scissor2.price);
		System.out.println(scissor2.material);
		Scissor scissor3=new Scissor("Fastrack","Black","Good",'M');
		System.out.println(scissor3.brand);
		System.out.println(scissor3.color);
		System.out.println(scissor3.type);
		System.out.println(scissor3.usage);
		System.out.println(scissor3.size);
		System.out.println(scissor3.price);
		System.out.println(scissor3.material);
		Scissor scissor4=new Scissor("Titan","Silver","Bad",'S',20000,"Steel");
		System.out.println(scissor4.brand);
		System.out.println(scissor4.color);
		System.out.println(scissor4.type);
		System.out.println(scissor4.usage);
		System.out.println(scissor4.size);
		System.out.println(scissor4.price);
		System.out.println(scissor4.material);
		Scissor scissor5=new Scissor("Redmi","Leather","Super",'S',80000);
		System.out.println(scissor5.brand);
		System.out.println(scissor5.color);
		System.out.println(scissor5.type);
		System.out.println(scissor5.usage);
		System.out.println(scissor5.size);
		System.out.println(scissor5.price);
		System.out.println(scissor5.material);
		Scissor scissor6=new Scissor();
		System.out.println(scissor6.brand);
		System.out.println(scissor6.color);
		System.out.println(scissor6.type);
		System.out.println(scissor6.usage);
		System.out.println(scissor6.size);
		System.out.println(scissor6.price);
		System.out.println(scissor6.material);
	}
}