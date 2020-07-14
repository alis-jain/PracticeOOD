import java.lang.Math.*;

class Gear{	
	int chainring;
	int cog;
	Wheel myWheel;

	Gear(int chainring, int cog, Wheel myWheel){
		this.chainring = chainring;
		this.cog = cog;
		this.myWheel = myWheel;
	}

	double gearInches(){
		return gearRatio()*getDiameter();
	}

	double gearRatio(){
		return ((double)chainring)/cog;
	}

	double getDiameter(){
		return myWheel.wheelDiameter();
	}
}

class Wheel{
	double rim;
	double tire;

	Wheel(double rim, double tire){
		this.rim = rim;
		this.tire = tire;
	}

	double wheelDiameter(){
		return rim + 2*tire;
	}

	double wheelCircumference(){
		return wheelDiameter()*Math.PI;
	}
}

class Bicycle{
	public static void main(String[] args){
		Wheel myWheel = new Wheel(26, 1.5);
		System.out.println("Circumference = " + myWheel.wheelCircumference());
		Gear newGear = new Gear(52, 11, myWheel);
		System.out.println("Ratio = " + newGear.gearRatio());
		System.out.println("Inches = " + newGear.gearInches());
	}
}

