import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str="";
		int i;
		for(i=0;i<str.length();i++)
		{
			str[i]=sc.next();
		}
		for(int j=str.length()-1;j>0;j--)
		{
			if(str[i]==str[j])
			{
				System.out.println("panlindrome");
			}
			else
			{
				System.out.println("Not palindrome");
			}
		}
	}
}