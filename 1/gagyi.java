public class gagyi {

	public static void main(String[] args) {
		
		Integer x = 128;
		Integer t = 128;
		
		if(x <= t && x >= t && t != x) {
			System.out.println("Belep az elso ciklusba.");
		}
	
		x = 25;
		t = 25;
		
		if(x <= t && x >= t && t != x) {
			System.out.println("Belep a masodik ciklusba.");
		}

		x = new Integer(50);
		t = new Integer(50);
		
		if(x <= t && x >= t && t != x) {
			System.out.println("Belep a harmadik ciklusba.");
		}
		
		
	}
}
