package aDavidExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.rmi.CORBA.Util;


public class Pair<T extends Comparable <T>> {
		public T elementA;
		public T elementB;
		
		
public Pair(T element1,T element2){
	elementA=element1;
	elementB=element2;
}
public String toString(){
	return "("+(String) elementA+")"+"("+(String) elementB+")";
	
}
public String toSortedString(){
	
	if(elementA.compareTo(elementB)>0){
		return "("+(String) elementB+")"+"("+(String) elementA+")";
	} 
	return "("+(String) elementA+")"+"("+(String) elementB+")";
	
}


}
