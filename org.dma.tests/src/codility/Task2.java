package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

	public static int solution(List<String> list) {
		List<Integer> mask = new ArrayList<>();
		int max = 0;
		mask.add(0);
		for (String s : list) {
			int dup = 0, cur = 0;
			for (char c : s.toCharArray()) {
				dup |= cur & (1 << (c - 'a'));
				cur |= 1 << (c - 'a');
			}
			if (dup > 0) continue;
			for (int i = 0; i < mask.size(); ++i) {
				if ((mask.get(i) & cur) > 0) continue;
				int comb = mask.get(i) | cur;
				mask.add(comb);
				max = Math.max(max, Integer.bitCount(comb));
			}
		}
		return max;
	}
	
	public static int solution(String[] A) {
		return solution(Arrays.asList(A));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(new String[]{"co","dil","ity"})); //5
		System.out.println(solution(new String[]{"abc","kkk","def","csv"})); //6
		System.out.println(solution(new String[]{"abc","ade","akl"})); //3
		
	}

}