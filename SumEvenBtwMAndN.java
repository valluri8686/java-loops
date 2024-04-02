class SumEvenBtwMAndN {
	public static void main(String[] args) {
		sumEvenBtwMAndN(9,2);
	}

	public static void sumEvenBtwMAndN (int m,int n){
		int sum=0;
		if (m<n){
			while (m<n){
				m++;
				if (m%2==0)
				{
					sum=m+sum;
				}
			
			}
			System.out.println("The Sum of Even Natural numbers between m and n is " + sum);
		}
		else {
			while (n<m){
				n++;
				if (n%2==0)
				{
					sum=n+sum;
				}
				
			}
			System.out.println("The Sum of Even Natural numbers between n and m is " + sum);
		}
	}
}