class Bicycle{
    String size, chain;
    String tire_size;

    Bicycle(String size, String chain, String tire_size){
        this.size = size;
        this.chain = chain == null ? defaultChain() : chain;
        this.tire_size = tire_size == null ? defaultTire_size(): tire_size;
    }

    void displaySpares(){
		System.out.println("Chain is " + chain);
		System.out.println("Tire_size is " + tire_size);
	}

    String defaultChain(){
        return "10-speed";
    }

    String defaultTire_size(){
    	return null;
    }
}

class RoadBike extends Bicycle{
	String tape_color;

	RoadBike(String tape_color, String size, String chain, String tire_size){
		super(size, chain, tire_size);
		this.tape_color = tape_color;
	}

	void displaySpares(){
        super.displaySpares();
        System.out.println("Color of Tape is: " + tape_color);
    }

    String defaultTire_size(){
    	return "23";
    }
}

class MountainBike extends Bicycle{
    String front_shock, rear_shock;

    MountainBike(String front_shock, String rear_shock, String chain, String size, String tire_size){
        super(size, chain, tire_size);
        this.front_shock = front_shock;
        this.rear_shock = rear_shock;
    }

    void displaySpares(){
        super.displaySpares();
        System.out.println("Front_shock: " + front_shock);
        System.out.println("Rear_shock: " + rear_shock);
    }

    String defaultTire_size(){
        return "2.1";
    }

    String defaultChain(){
        return "15-speed";
    }
}

public class BicycleType{
	public static void main(String[] args){
		MountainBike mountainbike = new MountainBike("Manitou", "Fox", null, "S", null);
		mountainbike.displaySpares();
		System.out.println();
		RoadBike roadbike = new RoadBike("purple", "M", null, "53.26");
        roadbike.displaySpares();
        System.out.println();
	}
}