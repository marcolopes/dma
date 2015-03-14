package tests;

public class Enumerator {
	
	enum ONE {
		ONE_1 (TWO.TWO_1, THREE.THREE_1);
		private TWO e1;
		private THREE e2;
		private ONE(TWO e1, THREE e2) {
			this.e1=e1;
			this.e2=e2;
		}
	}
	
	enum TWO {
		TWO_1 (THREE.THREE_1, ONE.ONE_1);
		private THREE e1;
		private ONE e2;
		private TWO(THREE e1, ONE e2) {
			this.e1=e1;
			this.e2=e2;
		}
	}
	
	enum THREE {
		THREE_1 (ONE.ONE_1, TWO.TWO_1);
		private ONE e1;
		private TWO e2;
		private THREE(ONE e1, TWO e2) {
			this.e1=e1;
			this.e2=e2;
		}
	}
	
	public static void main(String[] argvs){
		System.out.println(ONE.ONE_1.e1);
		System.out.println(ONE.ONE_1.e2);
		System.out.println(TWO.TWO_1.e1);
		System.out.println(TWO.TWO_1.e2);
		System.out.println(THREE.THREE_1.e1);
		System.out.println(THREE.THREE_1.e2);
	}

}
