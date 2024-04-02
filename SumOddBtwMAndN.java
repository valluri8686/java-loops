class SumOddBtwMAndN {
	public static void main(String[] args) {
		sumOddBtwMAndN(1,10);
	}

	public static void sumOddBtwMAndN (int m,int n){
		int sum=0;
		
		if (m<n){
			m++;
			while (m<n){
				
				if (m%2!=0)
				{
					sum=m+sum;
				}
				m++;
			
			}
			System.out.println("The Sum of Odd Natural numbers between m and n is " + sum);
		}
		else {
			n++;
			while (n<m){
				
				if (n%2!=0)
				{
					sum=n+sum;
				}
				n++;
				
			}
			System.out.println("The Sum of Odd Natural numbers between n and m is " + sum);
		}
	}
}