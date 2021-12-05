package methods;

abstract class Bank
{
  abstract int roi();
}
class AxisBank extends Bank
{
	int roi()
	{
		return 9;
	}
}
class SBIBank extends Bank
{
	int roi()
	{
		return 12;
	}
}
class Test6
{
	public static void main(String[] args)
	{
		AxisBank a = new AxisBank();
		System.out.println(a.roi());
		
		SBIBank s = new SBIBank();
		System.out.println(s.roi());//output-9,12
	}
}
