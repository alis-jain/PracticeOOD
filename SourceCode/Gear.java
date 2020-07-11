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
		return gearRatio()*(rim + 2*tire);
	}

	double gearRatio(){
		return (chainring*1.0)/cog;
	}
}
