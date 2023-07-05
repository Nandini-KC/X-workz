class MetroRunner
{
	public static void main(String[] args)
	{
		Metro metro=new Metro("Yellow",21,"BTM","Marathahalli",10000);
		System.out.println("Metro Line ="+metro.line);
		System.out.println("Distance ="+metro.distance);
		System.out.println("Start place="+metro.start);
		System.out.println("Destination="+metro.destination);
		System.out.println("Capacity="+metro.capacity);
		
	}
}