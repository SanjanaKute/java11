package java11;
@FunctionalInterface
interface SimpleInterest1
{
	float operation(float p, float t, float r);
}
public class SimpleInterest 
{

	public static void main(String[] args) 
	{
		SimpleInterest1 s=(p,t,r) ->(p*t*r)/100;
		System.out.println("Simple Interest:"+s.operation(1200, 10,15));

	}

}
