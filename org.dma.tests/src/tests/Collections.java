package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collections {

	static Collection<? super Number> n1=new ArrayList<Object>();
	static Collection<? extends Number> n2=new ArrayList<Integer>();

	static Collection<? super String> s1=new ArrayList<Object>();
	static Collection<? extends String> s2=new ArrayList<String>();

	static Collection<Object> s;

	public static void main(String[] argvs){

		List<String> list=new ArrayList();
		list.addAll(Arrays.asList("1","2","3"));
		System.out.println(list);

		s=(List)list;
		System.out.println(s);
		s1=list;
		System.out.println(s1);
		s2=(List)list;
		System.out.println(s2);
		
	}

}
