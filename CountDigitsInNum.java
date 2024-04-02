class CountDigitsInNum 
{
	public static void main(String[] args) 
	{
		int num =332465950,count=0, temp;
		temp=num;
		while(num!=0){
			num=num/10;
			count++;
		}
		System.out.println(temp + " has " + count +  " digits.");
	}
}
