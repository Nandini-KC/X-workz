class FishRunner
{
	public static void main(String[] args)
	{
		Fish ref=new Fish();
		System.out.println(ref.name);
		System.out.println(ref.type);
		System.out.println(ref.price);
		System.out.println(ref.location);
		
		Fish fish=new Fish("Tiger fish","Bone less");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.location);
		
		Fish fish1=new Fish(200);
		System.out.println(fish1.name);
		System.out.println(fish1.type);
		System.out.println(fish1.price);
		System.out.println(fish1.location);
		
		Fish fish2=new Fish("Banglore");
		System.out.println(fish2.name);
		System.out.println(fish2.type);
		System.out.println(fish2.price);
		System.out.println(fish2.location);
	}
}