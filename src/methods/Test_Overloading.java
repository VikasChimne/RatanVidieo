package methods;

public class Test_Overloading//one class having more than 1 method with same name but diff arguments
{  //Overloaded Methods
  void sum(int a)
  {
	  System.out.println(a+a);
  }
  void sum(int a,int b)
  {
	  System.out.println(a+b);
  }
  void sum(double d1,double d2)
  {
	  System.out.println(d1+d2);
  }
  public static void main(String[] args)
  {
	  Test_Overloading t=new Test_Overloading();
	  t.sum(10);
	  t.sum(10, 20);
	  t.sum(10.5, 10.5);
  }
}

//case1:Invalid          case2:Valid                     case3:Valid
//  void m1(int a);        void m1(int a,cha ch);           int m1(cha ch);
//  void m1(int b);        void m1(cha ch,int a);           String m1(int a);

