package collectionSorting;
//Sorting of eid using normal version of comparable
public class Emp implements Comparable<Emp>{
   int eid;
   String ename;
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
//}@Override
//public int compareTo(Object o) 
//{
//	Emp e = (Emp)o;
//	if(eid==e.eid)
//		return 0;
//	else if(eid>e.eid)
//			return 1;
//		else
//			return -1;
//}
}
//Sorting of ename using generic version of comparable
@Override
public int compareTo(Emp e) {
	
	return ename.compareTo(e.ename);
}
}