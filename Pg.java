class Pg{
	static String pgName;
	static String pgType;
	static int pgPrice;
	
	static void setPgName(String name)
	{
		pgName=name;
	}
	static String getPgName()
	{
		return pgName;
	}
	static void setPgType(String type)
	{
		pgType=type;
	}
	static String getPgType()
	{
		return pgType;
	}
	static void setPgPrice(int price)
	{
		pgPrice=price;
	}
	static int getPgPrice()
	{
		return pgPrice;
	}

}