import java.util.Scanner;
class ProNumEvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem ,pro=1;
		while(num!=0){
			rem=num%10;
			pro=pro*rem;
			num/=10;

		}
		
		if (pro%2==0)
		{
			System.out.println(pro +" is even");
		}
		else
			System.out.println(pro + "is odd");
	}
}
