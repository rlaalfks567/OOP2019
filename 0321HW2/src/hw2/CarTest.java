package hw2;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("Canival", "2010", 800);
		Car c2 = new Car("Sonata", "2018", 900);
		
		c1.setPrice(-500);
		System.out.println(c1.getPrice()*95/100);
	}
}