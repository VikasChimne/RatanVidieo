package stringsManupulation;
//String to StringBuffer Conversion                  //StringBuffer Conversion to String
//String s = "Vicky";                               //StringBuffer sb = new StringBuffer("Vicky");
//StringBuffer sb = new StringBuffer(s);            //String ss = sb.toString();
//System.out.println(sb);
//System.out.println(sb.reverse())

//For String Class no any reverse() method          //for StringBuffer class reverse()method is available
public class Test5
{
      public static void main(String[] args) 
    {
  //equals():return type boolean
    	  String s1 = "Vicky";
    	  String s2 = "Nishu";
    	  String s3 = "Vicky";
    	  System.out.println(s1.equals(s2));//false
    	  System.out.println(s1.equals(s3));//true
    	  System.out.println(s2.equals(s3));//false
    	  System.out.println("ratan".equals("RATAN"));//false
    	  System.out.println("ratan".equalsIgnoreCase("RATAN"));//true
   //compareTo():return type int
    	  String str1 = "Vicky";
    	  String str2 = "Rajveer";
    	  String str3 = "Vicky";
    	  System.out.println(str1.compareTo(str2));//4
    	  System.out.println(str1.compareTo(str3));//0
    	  System.out.println(str2.compareTo(str1));//-4
    	  System.out.println("vicky".compareTo("VICKY"));//32
    	  System.out.println("vicky".compareToIgnoreCase("VICKY"));//0
	}

}
