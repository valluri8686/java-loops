import java.util.Scanner;
class SumNumEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem ,sum=0;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num/=10;

		}
		if (sum%2==0)
		{
			System.out.println("even");
		}
		else
			System.out.println("odd");
	}
}
