import java.util.Scanner;
class NumsBtwMAndNWith3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the M number : ");
		int m=sc.nextInt();
		System.out.println("Enter the N number : ");
		int n=sc1.nextInt();
		int sum=0;
		for (int i=m;i<n ;i++ )
		{
			sum=sum+check(i);

		}
		System.out.println("Total count of numbers having 3 is "+sum);
	}
	public static int check(int n){
		int count=0,rem;
		while (n!=0)
		{
			rem=n%10;
			if(rem==3){
				count++;
				System.out.println(n);
			}
			n=n/10;
		}
		return count;
	}
}
