class EvenBtwMAndN 
{
	public static void main(String[] args) 
	{
		EvenBtwMAndN(1,15);
	}


		public static void EvenBtwMAndN (int m,int n){

			int  even=1;
			if (m<n)
			{
				
				while (m<n){
				m++;
				if (m%2==0)
				{
					System.out.println(m);
					
				}
				
				}

			}
			else {
				while (n<m)
			{
				n++;
				if (n%2==0)
				{
					System.out.println(n);
				}
				
			}
			
			}

		}
	
}