package hw2;

public class Car {
	String model;
	String year;
	double price;
	
	//생성자 만들기
	public Car(String model, String year, double price) {
		this.model = model;
		this.price = price;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0.0)
			this.price = price;
	}
}
