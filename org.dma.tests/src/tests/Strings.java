package tests;

public class Strings {
	
	public static class CustomString {
		
		char[] data;
		
		public CustomString(char[] data) {
			this.data=data;
		}
		
		@Override
		public String toString() {
			return String.valueOf(data);
		}
		
	}

	public static void main(String[] argvs){

		final char[] array={'1','2','3'};
		System.out.println(array);
			
		CustomString string=new CustomString(array);
		System.out.println(string);
		
		array[0]='0';
		System.out.println(array);
		System.out.println(string);
		
	}

}
