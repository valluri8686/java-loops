import java.util.Scanner;
class NumsBtwMAndNWithout7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the M number : ");
		int m=sc.nextInt();
		System.out.println("Enter the N number : ");
		int n=sc1.nextInt();
		for (int i=m;i<n ;i++ )
		{
			if (check(i))
			{
				System.out.println(i);
			}
		}
		
		
	}
	public static boolean check(int n){
		int count=0,rem;
		while (n!=0)
		{
			rem=n%10;
			if(rem==7){
				count++;
			}
			n=n/10;
		}
		return count==0;
		


	}
}
