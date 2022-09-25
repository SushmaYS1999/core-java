class Vessel{
	static String vesselName;
	static String vesselType;
	static int vesselPrice;
	
	static void setVesselName(String name)
	{
		vesselName=name;
	}
	static String getVesselName()
	{
		return vesselName;
	}
	static void setVesselType(String type)
	{
		vesselType=type;
	}
	static String getVesselType()
	{
		return vesselType;
	}
	static void setVesselPrice(int price)
	{
		vesselPrice=price;
	}
	static int getVesselPrice()
	{
		return vesselPrice;
	}

}