package collectionSorting;

import java.util.Comparator;

//Collections data Sorting Comparator,
//#Comparable:Limitataion
//1)we are mixing sorting logics & business logics in Single class
//2)one property sorting possible
//#Advantages
//1)we can separate sorting logics & business in single class
//2)multiple properties sorting possible
public class EidComp implements Comparator
{
     
	
	@Override
	public int compare(Object o1, Object o2) {
		Emp1 e1 = (Emp1)o1;
		Emp1 e2 = (Emp1)o2;
		if(e1.eid==e2.eid)
		return 0;
		else if(e1.eid>e2.eid)
			return 1;
		else
			return -1;
	}
}
//Comparable-->collections.sort(al)
//1)Mixing/Normal sorting logic allowed
//2)Only one property at time
//#To overcome this Problem we use comparator object-->is only for user defined classes
//1)Separate logic in two diff classes.2)Multiple Property logic used
