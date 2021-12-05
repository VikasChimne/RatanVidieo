package linkedlistExample;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test2 
{     public static void main(String[] args)
    {
		LinkedList<Book>l=new LinkedList<Book>();
		l.add(new Book(111,"Java","ratan"));
		l.add(new Book(222,"C","durga"));
		l.add(new Book(111,"CPP","anu"));
//By using ListIterator remove :C
		ListIterator<Book>lstr=l.listIterator();
		lstr.add(new Book(444,"Python","surya"));
		while(lstr.hasNext())
		{
			Book b = lstr.next();
			if(b.name.equals("C"))
				lstr.remove();
		}
//Print the Data for each loop
		for(Book b:l)
		{
			System.out.println(b.id+" "+b.name+" "+b.autor);
		}
	}
}
//                LinkedList                                                 ArrayList
// 1)Underline data structure is double linkedList    1)Underline data structure is resizable array
//2)For insertion operation LinkedList performance is good 2)performance is decreased
//3)                                                        3)searching operation based on index
//4)We have to stored the data & linked address also 4)We have directly stored the data(take less memory)
//5)It is not Implementing the random access,so      5)It is Implementing the random access,so
//data access is slow                                                     data access is fast
  












