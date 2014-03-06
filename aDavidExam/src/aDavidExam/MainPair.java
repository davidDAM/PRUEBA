package aDavidExam;

import java.util.ArrayList;
import java.util.List;

public class MainPair {

	public static <T> void main(String[] args) {
		Pair<String> p1=new Pair<String>("uno","dos");
		Pair<String> p2=new Pair<String>("tres","cuatro");
		Pair<String> p3=new Pair<String>("cinco","seis");
		Pair<String> p4=new Pair<String>("sieste","ocho");
		Pair<String> p5=new Pair<String>("nueve","diez");
		
		List<Pair> list=new ArrayList<Pair>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		System.out.println(list);
		
		System.out.println(p3.toSortedString());
		
		
	}

}
