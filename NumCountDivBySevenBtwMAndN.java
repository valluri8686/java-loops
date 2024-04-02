class NumCountDivBySevenBtwMAndN
{
	public static void main(String[] args) 
	{
		int m=3,n=15,count=0,num;
		num=m;
		num++;
		while(num<n){
			
			if (num%7==0)
			{
				count++;
			}
			num++;
		}
		System.out.println("count of number divisible by 7 btw "+m+" and "+n+" is "+count);
		}
}
