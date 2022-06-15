package tests;

public class Integers {
	
	private Integer I1=0;
	private Integer I2=new Integer(0);

	private void equals(Integer i) {
		
		System.err.println(I1==i);
		System.err.println(I1.equals(i));
		
		System.err.println(I2==i);
		System.err.println(I2.equals(i));
		
	}

	public static void main(String[] argvs) {

		Integers integers=new Integers();

		integers.equals(0);
		integers.equals(new Integer(0));
		
	}

}
