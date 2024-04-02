class ProductBtwMAndN 
{
	public static void main(String[] args) 
	{
		productBtwMAndN(7,2);
	}


		public static void productBtwMAndN (int m,int n){

			int pro=1;
			if (m<n)
			{
				while (m<n){
				m++;
				pro=m*pro;
				}
				System.out.println("The Product of Natural numbers between m and n is " + pro);
			}
			else {
				while (n<m)
			{
				n++;
				pro=n*pro;
			}
			System.out.println("The Product of Natural numbers between n and m is " + pro);
			}

		}
	
}