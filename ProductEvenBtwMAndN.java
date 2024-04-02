class ProductEvenBtwMAndN 
{
	public static void main(String[] args) 
	{
		productEvenBtwMAndN(1,5);
	}


		public static void productEvenBtwMAndN (int m,int n){

			int pro=1, even=1;
			if (m<n)
			{
				m++;
				while (m<n){
				
				if (m%2==0)
				{
					even=m;
					pro=even*pro;
				}
				m++;
				
				}
				System.out.println("The Product of Even Natural numbers between m and n is " + pro);
			}
			else {
				n++;
				while (n<m)
			{
				
				if (n%2==0)
				{
					even=n;
					pro=even*pro;
				}
				n++;
				
			}
			System.out.println("The Product of Even Natural numbers between n and m is " + pro);
			}

		}
	
}