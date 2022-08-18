package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {
	
	public static int solution2(int[] A) {

		Set<Integer> set=new HashSet();
		for(int i: A){
			if(i>0) set.add(i);
		}
		for(int i=1; i<=A.length+1; i++){
			if(!set.contains(i)) return i;
		}return 1;

	}
	
	public static int solution(int[] A) {
		
		if(A.length==0) return 1;
		int smallest=1;
		Arrays.sort(A);
		for(int value: A){
			if(value==smallest) smallest++;
		}return smallest;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
		System.out.println(solution(new int[]{1, 2, 3}));
		System.out.println(solution(new int[]{-1, -3}));
		System.out.println(solution(new int[]{}));
		
	}

}
