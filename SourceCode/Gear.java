class Gear{
	int chainring;
	int cog;
	double rim;
	double tire;

	Gear(int chainring, int cog, double rim, double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	double gearInches(){
		return gearRatio()*diameter();
	}
	
	double gearRatio(){
		return ((double)chainring)/cog;
	}

	double diameter(){
		return rim + 2*tire;
	}
}
