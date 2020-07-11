class Gear{
	int chainring;
	int cog;

	Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}

	double ratio(){
		return (chainring*1.0)/cog;
	}
}
