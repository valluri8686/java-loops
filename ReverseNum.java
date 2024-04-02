import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		long num =sc.nextLong();
		long num1=num;
		long rem;
		String temp ="";
		while (num!=0){
			
			rem=num%10;
			temp= temp+rem;
			num=num/10;

		}
		System.out.println("reverse of given number "+ num1  +" is  "+ temp);
	}
}
