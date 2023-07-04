class BasketRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in BasketRunner");
		Basket basket=new Basket("pink");
		System.out.println(basket.color);
		System.out.println(basket.capacity);
		System.out.println(basket.size);
		Basket basket1=new Basket("Blue",500);
		System.out.println(basket1.color);
		System.out.println(basket1.capacity);
		System.out.println(basket1.size);
		Basket basket2=new Basket("Big","green",1000);
		System.out.println(basket2.color);
		System.out.println(basket2.capacity);
		System.out.println(basket2.size);
	}
}