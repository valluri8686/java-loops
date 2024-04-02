import java.util.Scanner;
class NumsBtwMAndNWith5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the M number : ");
		int m=sc.nextInt();
		System.out.println("Enter the N number : ");
		int n=sc.nextInt();
		int sum=0;
		for (int i=m;i<n ;i++ )
		{
			
			sum=sum+check(i);

		}
		System.out.println("total count of numbers having 5 : "+ sum);
		
		
	}
	public static int check(int n){
		int count=0,rem;
		while (n!=0)
		{
			rem=n%10;
			if(rem==5){
				count++;
			
			}
			n=n/10;
		}
		return count;
		


	}
}
