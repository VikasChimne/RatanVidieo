package collectionSorting;

import java.util.Comparator;
//Generic logic
public class EnameComp implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 e1, Emp1 e2) {
		
		return e1.ename.compareTo(e2.ename);
	}
        
}

