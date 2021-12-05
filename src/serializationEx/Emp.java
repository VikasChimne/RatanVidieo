package serializationEx;

import java.io.Serializable;

public class Emp implements Serializable//Initially a class Serialization is not supported but after implements Serialization of particular class
{//Default value of int is zero
	transient int eid;//The variable declare as transient, that variable not take participant in serialization instead of original values,default values will be transfered
  String ename;//Default value of String is null
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
}
