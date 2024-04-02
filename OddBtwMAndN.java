class OddBtwMAndN {
	public static void main(String[] args) 
	{
		oddBtwMAndN(1,15);
	}


		public static void oddBtwMAndN (int m,int n){
			if (m<n){
				while (m<n){
					m++;
					if (m%2!=0){
						System.out.println(m);	
					}
				}
			}
			else {
				while (n<m){
					n++;
					if (n%2!=0){
						System.out.println(n);
					}
				}
			}

		}
	
}