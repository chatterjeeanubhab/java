class Exceptionhanlding
{
	void div(int a,int b) throws ArithmeticException
	{
		int c=(a/b);
		
		System.out.println(c);
	}
	public static void main(String[] args) {
		Exceptionhanlding h=new Exceptionhanlding();
		h.div(20,0);
	}
	
}