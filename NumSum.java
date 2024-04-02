import java.util.Scanner;
class NumSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem,sum=0;
		while (num!=0)
		{
			rem=num%10;
			sum=rem+sum;
			num=num/10;
		}
		System.out.println(sum);
	}
}
