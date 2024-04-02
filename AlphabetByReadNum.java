class  AlphabetByReadNum{
	public static void main(String[] args) 
	{
		int num=25;
		read(num);
		
	}
	public static void read(int num){
		char ch;
		ch=(char)(num+64);
		System.out.println(ch);
	}
}