class ProductOddBtwMAndN 
{
	public static void main(String[] args) 
	{
		productOddBtwMAndN(1,15);
	}


		public static void productOddBtwMAndN (int m,int n){

			int pro=1;
			if (m<n)
			{
				m++;
				while (m<n){
				
				if (m%2!=0)
				{
					pro=m*pro;
				}
				m++;
				
				}
				System.out.println("The Product of Odd Natural numbers between m and n is " + pro);
			}
			else {
				n++;
				while (n<m)
			{
				
				if (n%2==0)
				{
					
					pro=n*pro;
				}
				n++;
				
			}
			System.out.println("The Product of Odd Natural numbers between n and m is " + pro);
			}

		}
	
}