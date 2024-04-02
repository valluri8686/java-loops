class QuoWithoutDivisionOperator 
{
	public static void main(String[] args) 
	{
		int num = 9, div= 2,count=0,sum=0;
		while(sum<num){
			
			sum=div+sum;
			if (sum<=num)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
