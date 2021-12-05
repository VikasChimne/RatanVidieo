package collectionFramework;//java.util package

public class Emp 
{
   int eid;
   String ename;
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}}
//Representing Group of object as Single entity
//Is Providing very Good architecture to store the data and manipulate the data
//is having class and interface to work with group of object
//Collection is root interface of collection Framework
//The parent interface of the collection is Iterable
//Key Interfaces of Collection Framework
//1)Collection 2)List 3)sort 4)sortedSet 5)NavigableSet 6)Queue
//The Classes which are introduced in java 1.0 is called legacy classes
//#Characteristics of Collection classes#
//1)Diff classes has diff version2)Heterogeneous data allowed 3)null insertion for all classes
//4)methods are synchronized or non synchronized