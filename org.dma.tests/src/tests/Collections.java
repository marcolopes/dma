package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collections {

	public static void main(String[] argvs){
		
		List<String> list=new ArrayList();
		list.addAll(Arrays.asList("1","2","3"));
		System.out.println(list);

		Collection<Object> s=(List)list;
		System.out.println(s);
		
		Collection<? super String> s1=new ArrayList();
		s1.addAll(list);
		System.out.println(s1);
		
		Collection<? extends String> s2=list;
		System.out.println(s2);
		
	}

}
