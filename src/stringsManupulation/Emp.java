package stringsManupulation;
//
public class Emp
{
   int eid;
   String ename;
   public Emp(int eid,String ename)
   {
	   super();
	   this.eid=eid;
	   this.ename=ename;
   }
   public String toString()
   {
	   return "Emp id:"+eid+"Emp Name:"+ename;
   }
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(111,"return");
        System.out.println(e1);//It automatically call toString method internally
        System.out.println(e1.toString());//this method is automatically called when you print reference variable in java
	}
//toString is basically from object class if you are not overriding then output=object class
}//Here we are not overriding toString():then object class toString() executed
//if we are overriding toString():then our class toString() executed
