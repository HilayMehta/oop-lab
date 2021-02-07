import java.util.*;
class Counter
{
	static int cnt=0;

	Counter()
	{
		cnt++;
	}

	static void showCount()
	{
		System.out.println("No. of objects created= "+cnt);
	}

	public static void main(String args[])
	{
		int flag=0;
		Scanner sc= new Scanner(System.in);
		do
		{
			Counter ob= new Counter();
			System.out.println("1 to Continue, 0 to exit");
			flag=sc.nextInt();
		}while(flag==1);

	//	Counter ob=new Counter();
		Counter.showCount();
	}
}
