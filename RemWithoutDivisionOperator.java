class RemWithoutDivisionOperator 
{
	public static void main(String[] args) 
	{
		int num=25,div=7,sum=0;
		while((sum<num)){
			sum=div+sum;
			if ((num-sum)<div && (num-sum)>=0)
			{
				System.out.println(num-sum);
			}
		}
	}
}
