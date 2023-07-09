class WorkerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in WorkerRunner");
		Worker ref=new Worker("Suresh","BTM",51,20000,"Male");
		ref.printInstanceVariable();
		System.out.println("Updated variables");
		ref.workerName="Rani";
		ref.place="Majistic";
		ref.salary=18000;
		ref.age=35;
		ref.gender="Female";
		ref.printInstanceVariable();
	}
}