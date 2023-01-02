package javaPractical1;

public class FactoralRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factorial of 5 is "+getfactorial(5));
	}
	
	static int getfactorial(int num)
	{
		 if (num==0 || num==1)
			 return 1;
		 else 
			 return (num*getfactorial(num-1));
	}
}
