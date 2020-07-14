class Bicycle{
	String size;
	String tape_color;
	String chain, tire_size;

	Bicycle(String size, String tape_color){
		this.size = size;
		this.tape_color = tape_color;
	}

	void spares(){
		this.chain = "10-speed";
		this.tire_size = "23";
	}
}

class BicycleType{
	public static void main(String[] args){
		Bicycle bike = new Bicycle("M", "Red");
		bike.spares();
		System.out.println("Size is " + bike.size);
		System.out.println("Chain is " + bike.chain);
	}
}