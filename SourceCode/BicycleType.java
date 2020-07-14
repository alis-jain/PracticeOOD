class Bicycle{
	String style, size;
	String tape_color;
	String chain, tire_size;
	String front_shock, rear_shock;

	Bicycle(String style, String size, String tape_color, String front_shock, String rear_shock){
		this.style = style;
		this.size = size;
		this.tape_color = tape_color;
		this.front_shock = front_shock;
		this.rear_shock = rear_shock;
	}

	void spares(){
		if (style == "road"){
			this.chain = "10-speed";
			this.tire_size = "23";
		}
		else{
			this.chain = "10-speed";
			this.tire_size = "2.1";
		}	
	}

	void displaySpares(){
		System.out.println("Chain is " + chain);
		System.out.println("Tire_size is " + tire_size);
	}
}

class BicycleType{
	public static void main(String[] args){
		Bicycle bike = new Bicycle("mountain", "S", "Red", "Manitou", "Fox");
		bike.spares();
		bike.displaySpares();
	}
}