class Car {
	private String color;
	private int wheels;
	private String brand;
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setWheels(int n) {
		this.wheels = n;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void runForward() {
		System.out.println("Runing Forward");
	}
	
	void runBackward() {
		System.out.println("Runing Backward");
	}
	
	String getColor() {
		return this.color;
	}
	
	String getBrand() {
		return this.brand;
	}

	@Override	
	public String toString() {
		return this.getBrand() + "-" + this.getColor() + this.wheels;
	}
}
