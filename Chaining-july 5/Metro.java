class Metro
{
	String line;
	int distance;
	String start;
	String destination;
	long capacity;
	Metro()
	{
		System.out.println("Running Metro constructor in Metro");
	}
	Metro(String line)
	{	
		this.line=line;
		System.out.println("Running String constructor in Metro");
	}
	Metro(String line,int distance)
	{	
		this(line);
		this.distance=distance;
		System.out.println("Running String,int constructor in Metro");
	}
	Metro(String line,int distance,String start)
	{	
		this(line,distance);
		this.start=start;
		System.out.println("Running String,int,String constructor in Metro");
	}
	Metro(String line,int distance,String start,String destination,long capacity)
	{	
		this(line,distance,start);
		this.destination=destination;
		this.capacity=capacity;
		System.out.println("Running String,int,String,String constructor in Metro");
	}
}