class Bicycle{
    String size, chain;
    String tire_size;

    public Bicycle(String size, String chain, String tire_size){
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

class BicycleType{
	public static void main(String[] args){
		MountainBike bike = new MountainBike("Manitou", "Fox", null, "S", null);
		bike.displaySpares();
	}
}