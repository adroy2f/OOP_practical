package javaPractical1;

public class armstrong {
	static int getDigitSqSum(int num) 
	{	int r,sq,sum=0;
		for(;num>0;num/=10)
		{
			r=num%10;
			sq=r*r*r;
			sum+=sq;	
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 100,sum;
	   sum=getDigitSqSum(num);
		if(num==sum)
			System.out.println(num+" is an Armstrong number");
		else
			System.out.println(num+" is not an Armstrong number");
		
		num=153;
		sum=getDigitSqSum(num);
		System.out.println(num +" is "+((sum==num)?"an":"not an")+" armstrong number");
		
		System.out.println("Armstrong numbers are:");
		for(int i=100;i<1000;i++)
		{	
			sum=getDigitSqSum(i);
			if (sum==i)
				System.out.println(sum);
		}
	}
}
