class SumBtwMAndN {
	public static void main(String[] args) {
		sumBtwMAndN(27,2);
	}

	public static void sumBtwMAndN (int m,int n){
		int sum=0;
		if (m<n){
			while (m<n){
				m++;
				sum=m+sum;
			}
			System.out.println("The Sum of Natural numbers between m and n is " + sum);
		}
		else {
			while (n<m){
				n++;
				sum=n+sum;
			}
			System.out.println("The Sum of Natural numbers between n and m is " + sum);
		}
	}
}