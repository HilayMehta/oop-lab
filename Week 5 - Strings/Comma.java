import java.util.*;

class Comma{

  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String n = sc.nextLine();
        int temp = Integer.parseInt(n);
        int num = (int) n.length()/3;
        int j = n.length();
        for(int i = 0;i<num;i++){
            j = j-3;
            System.out.println(j);
            if(j>0){
              String t1 = n.substring(j,n.length());
              String t2= n.substring(0,j);
               n = t2 + "," + t1;
               System.out.println(n);
            }
        }
        System.out.println(n);
  }
}


 /*import java.util.Scanner;
class CommaNos
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		String n=sc.nextLine();
		int l=n.length();
		int num=Integer.parseInt(n);
		String nos[]=new String[100];
		String str1="",str2="";

			while(num!=0)
			{
				int rem=num%1000;

				num/=1000;
				str1=Integer.toString(rem)+","+str1;
			}

				System.out.println(str1);

		//for(int i=str1.length()-1;i>0;i--)
		//	str2=str2+str1.charAt(i);
		//for(int i=n.length()/3+1;i>=0;i++)
		//{
		//	str1=str1+","+nos[i];
		//}
		str2=str1.substring(0,str1.length()-1);
		System.out.println(str2);
	}
}*/
