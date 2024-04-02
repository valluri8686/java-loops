import java.util.Scanner;
public class VerticalDigits
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num,count=0,digit;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		count--;
		while (count>=0)
		{
			digit =num1/power(count);
			System.out.println(digit);
			num1=num1%power(count);
			count--;
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
