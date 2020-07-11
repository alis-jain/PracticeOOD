class Gear{
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
	}

	int chainring;
	int cog;
	Wheel myWheel;

	Gear(int chainring, int cog, double rim, double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.myWheel = new Wheel(rim, tire);
	}

	double gearInches(){
		return gearRatio()*myWheel.wheelDiameter();
	}

	double gearRatio(){
		return ((double)chainring)/cog;
	}
}