import java.util.Scanner;
class  NumLastUnitPlace
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num,count=0,digit;
		
		digit=num1%10;
		System.out.println(digit);
	}

}
