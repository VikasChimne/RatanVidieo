package stringsManupulation;
//StringBuffer and StringBuilder both are same but one exception
//StringBuffer is synchronized->only one thread can access-next thread can wait->thread safety but performance decreased
//StringBuilder is non synchronized->multiple threads can access-->not thread safety- performance is increased
import java.util.StringTokenizer;
//StringTokenizer belong to java.util package splitting the data by using space character
//If u want check whether token available or not we have method hasMoreElements()if hasMoreElements return true,
//then token is available then read the token by using nextElement()
public class Test8 
{
       public static void main(String[] args) 
    {
    	 StringTokenizer st = new StringTokenizer("hi sir class completed");
		while(st.hasMoreElements())
		{
			String s = (String)st.nextElement();
			System.out.println(s);
		}
		StringTokenizer st1 = new StringTokenizer("hi sir how are you");
        while(st1.hasMoreElements())
        {
        	String ss=st1.nextToken();
        	System.out.println(ss);
        }
	}

}
