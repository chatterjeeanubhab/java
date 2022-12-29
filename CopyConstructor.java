 /*class A
{
	
	 A(double a)
	{	
		this(20); 
		System.out.println("A1");
	} 
	A(int a)
	{
		this("anubhab");
		System.out.println("A2");
	}
	{ 
		System.out.println("instance block");
	}

	A(String a)
	{
		this();
		System.out.println("A3");
	}
	A()
	{
		System.out.println("A4");
	}
	static
	{
		System.out.println("static block");
	}


}
class CopyConstructor
{
	public static void main(String[] args) {
		A r=new A(10.5);
	}
}*/
class A
{
	int a;
	A(int a)
	{
		this(40);
		System.out.print(a); 
	}
	{
		System.out.print(a);
	}
}
class CopyConstructor
{
	
}

