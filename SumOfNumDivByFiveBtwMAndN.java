class SumOfNumDivByFiveBtwMAndN
{
	public static void main(String[] args) 
	{
		int m=1,n=16,num,sum=0,div=5;
		num=m;
		num++;
		while(num<n){
			
			if (num%div==0)
			{
				sum=sum+num;

			}
			num++;
		}
		System.out.println("Sum of number divisible by "+div+" btw "+m+" and "+n+" is "+sum);
		}
}
