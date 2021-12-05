package stack;//1.0 version#Last in First Out#It is Child class of Vector#support two operation1)Push2)pop

import java.util.Stack;

public class Test 
{
      public static void main(String[] args)
    {
		Stack<String>s = new Stack<String>();//generic used
		s.push("ratan");
        s.push("anu");
        s.push("durga");
        System.out.println(s);//ratan,anu,durga
        System.out.println(s.search("ratan"));
        s.pop();
        System.out.println(s);//ratan,anu
        System.out.println(s.peek());//anu
        System.out.println(s.empty());//false
        s.clear();
        System.out.println(s.empty());//true
	}

}
