import java.util.Scanner;
class  NumPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int num1=num,rem,count=0,palin=0,sum=0,temp=num1;
		while (num!=0)
		{
			num=num/10;
			count++;
		}
		count--;
		while (count!=0)
		{
			int digit;
			digit=power(count);
			rem=num1%10;
			sum=rem*digit;
			sum=sum+palin;
			palin=sum;
			num1=num1/10;
			count--;

		}
		if (temp/palin==1)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	public static int power(int j){
		int power=1;
		while (j!=0)
		{
			power=power*10;
			j--;
		}
		return power;
	}
}
