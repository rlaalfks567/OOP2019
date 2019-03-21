package p0;

public class PenguinTest {

	public static void main(String[] args) {
		Penguin »Ç·Î·Î = new Penguin();
//		»Ç·Î·Î.height = 190.5;
//		»Ç·Î·Î.weight = 0.1231;
//		»Ç·Î·Î.color = "Blue";
//		»Ç·Î·Î.kind = "È²Á¦ Æë±Ï";
//		»Ç·Î·Î.habitat = "³²±Ø";
		
		
		»Ç·Î·Î.setHeight(190.5);
		»Ç·Î·Î.setColor("red");
		»Ç·Î·Î.setWeight(95);
		
		double height = »Ç·Î·Î.getHeight();
		
		System.out.println(height);
	}

}
