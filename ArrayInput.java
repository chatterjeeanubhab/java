import java.util.Scanner;
class Test
{
	 void m(int[] arr,int n){
		
		System.out.println("Elements are...");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
class ArrayInput
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size..");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements...");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Test obj=new Test();
		obj.m(arr,n);
		
	}

}
